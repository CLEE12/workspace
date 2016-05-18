package samp01;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
public class ExecuteSqlMain {
    public static void main(String[] args) {    	
        ApplicationContext ctx = 
        	new ClassPathXmlApplicationContext("spring-db.xml");
       
        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
        NamedParameterJdbcTemplate npJdbcTemplate = 
        	ctx.getBean(NamedParameterJdbcTemplate.class);
     //   int count = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM PET");
       int count = jdbcTemplate.queryForObject(
    		"SELECT COUNT(*) FROM PET",Integer.class);
        System.out.println(count);
        
        String ownerName = "kk";
     //   count = jdbcTemplate.queryForInt(
     //      "SELECT COUNT(*) FROM PET WHERE OWNERNAME=?", ownerName);
        count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM PET WHERE OWNERNAME=?", 
                Integer.class, ownerName);
        System.out.println(count);
        
        int id = 1;
        String petName = jdbcTemplate.queryForObject(
            "SELECT PETNAME FROM PET WHERE PETID=?",
            String.class, id);
        System.out.println(petName);
        
        Date birthDate = jdbcTemplate.queryForObject(
            "SELECT BIRTHDATE FROM PET WHERE PETID=?", 
            Date.class, id);
        System.out.println(birthDate);        
        
        Map<String, Object> map = jdbcTemplate.queryForMap(
             "SELECT * FROM PET WHERE PETID=?", id);
        System.out.println(map.get("PETNAME"));
        System.out.println(map.get("OWNERNAME"));
        
        List<Map<String, Object>> mapList = 
        		jdbcTemplate.queryForList(
             " SELECT * FROM PET WHERE OWNERNAME=?", ownerName);
        for(int i=0;i<mapList.size();i++) {
        	System.out.println(mapList.get(i).get("PETNAME"));
        	System.out.println(mapList.get(i).get("OWNERNAME"));
        	System.out.println("===============");
        }
        List<Integer> priceList = jdbcTemplate.queryForList(
             "SELECT PRICE FROM PET WHERE OWNERNAME=?", 
             Integer.class, ownerName);
        for (Integer i : priceList) {
        	System.out.println("가격 = "+i);  
        }
        Pet pet = jdbcTemplate.queryForObject(
                "SELECT * FROM PET WHERE PETID=?"
                , new RowMapper<Pet>() {
                    public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Pet p = new Pet();
                        p.setPetId(rs.getInt("PETID"));
                        p.setPetName(rs.getString("PETNAME"));
                        p.setOwnerName(rs.getString("OWNERNAME"));
                        p.setPrice(rs.getInt("PRICE"));
                        p.setBirthDate(rs.getDate("BIRTHDATE"));
                        return p;
                    }}
                , id); 
        System.out.println(pet.getPetName());
        System.out.println(pet.getOwnerName());
        
        class MyRowMapper implements RowMapper<Pet> {
            public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
                Pet p = new Pet();
                p.setPetId(rs.getInt("PETID"));
                p.setPetName(rs.getString("PETNAME"));
                p.setOwnerName(rs.getString("OWNERNAME"));
                p.setPrice(rs.getInt("PRICE"));
                p.setBirthDate(rs.getDate("BIRTHDATE"));
                return p;
            }
        }
        pet = jdbcTemplate.queryForObject(
                " SELECT * FROM PET WHERE PETID=?"
                ,new MyRowMapper()
                ,id);
        System.out.println(pet.getPetName());
        System.out.println(pet.getOwnerName());
        
        List<Pet> petList = jdbcTemplate.query(
                " SELECT * FROM PET WHERE OWNERNAME=?"
                , new RowMapper<Pet>() {
                public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Pet p = new Pet();
                    p.setPetId(rs.getInt("PETID"));
                    p.setPetName(rs.getString("PETNAME"));
                    p.setOwnerName(rs.getString("OWNERNAME"));
                    p.setPrice(rs.getInt("PRICE"));
                    p.setBirthDate(rs.getDate("BIRTHDATE"));
                    return p;
                }}
            , ownerName);
        for(Pet p : petList) {
	        System.out.println(p.getPetName());
	        System.out.println(p.getOwnerName());
	        System.out.println("--------------");
        }
        pet = jdbcTemplate.queryForObject(
                " SELECT * FROM PET WHERE PETID=?"
                , new BeanPropertyRowMapper<Pet>(Pet.class)
                , id);
        System.out.println(pet.getPetName());
        System.out.println(pet.getOwnerName());

        System.out.println("bean 복수 테스트 시작");
        List<Pet> pets = jdbcTemplate.query(
                " SELECT * FROM PET WHERE ownerName=?"
                , new BeanPropertyRowMapper<Pet>(Pet.class)
              , "kk");
        
        for(Pet p : pets) {
        	 System.out.println(p.getPetName());
             System.out.println(p.getOwnerName());             
        } 
        System.out.println("bean 복수 테스트 끝");
        
        Owner owner = jdbcTemplate.query(
                " SELECT * FROM OWNER O, PET P where O.OWNERNAME=P.OWNERNAME and O.OWNERNAME=?"
                , new ResultSetExtractor<Owner>() {
                    public Owner extractData(ResultSet rs) throws SQLException, DataAccessException {
                        if (!rs.next()) {
                            return null;
                        }
                        Owner owner = new Owner();
                        owner.setOwnerName(rs.getString("OWNERNAME"));
                        do {
                            Pet pet = new Pet();
                            pet.setPetId(rs.getInt("PETID"));
                            pet.setPetName(rs.getString("PETNAME"));
                            pet.setOwnerName(rs.getString("OWNERNAME"));
                            pet.setPrice(rs.getInt("PRICE"));
                            pet.setBirthDate(rs.getDate("BIRTHDATE"));
                            owner.getPetList().add(pet);
                        } while(rs.next());
                        return owner;
                    }}
                , ownerName);
        System.out.println(owner.getOwnerName());
        for (Pet p : owner.getPetList()) {
        	System.out.println(p.getPetName());
        	System.out.println(p.getOwnerName());
        	System.out.println("=================");
        }
        List<Owner> ownerList = jdbcTemplate.query(
                " SELECT * FROM OWNER O, PET P where O.OWNERNAME=P.OWNERNAME ORDER BY p.OWNERNAME"
                , new ResultSetExtractor<List<Owner>>() {
                    public List<Owner> extractData(ResultSet rs) throws SQLException, DataAccessException {
                        List<Owner> result = new ArrayList<Owner>();
                        Owner owner = null;
                        String currentPk = "";
                        while (rs.next()) {
                            String ownerName = rs.getString("OWNERNAME");
                            if (!ownerName.equals(currentPk)) {
                                owner = new Owner();
                                owner.setOwnerName(rs.getString("OWNERNAME"));
                                currentPk = ownerName;
                                result.add(owner);
                            }
                            Pet pet = new Pet();
                            pet.setPetId(rs.getInt("PETID"));
                            pet.setPetName(rs.getString("PETNAME"));
                            pet.setOwnerName(rs.getString("OWNERNAME"));
                            pet.setPrice(rs.getInt("PRICE"));
                            pet.setBirthDate(rs.getDate("BIRTHDATE"));
                            owner.getPetList().add(pet);
                        }
                        return result;
                    }}
                );
        for(Owner ow :ownerList ) {
        	for (Pet p : ow.getPetList()) {
        		System.out.println(p.getOwnerName());
                System.out.println(p.getPetName());
                System.out.println(p.getOwnerName());
                System.out.println("***************");
        	}
        }    
        
        pet = new Pet();
        pet.setPetId(04);
        pet.setPetName("망아지");
        pet.setOwnerName("kk");
        pet.setPrice(10000);
        pet.setBirthDate(new Date()); 
        jdbcTemplate.update(
                "INSERT INTO PET (PETID,PETNAME,OWNERNAME,"
                + "PRICE,BIRTHDATE) VALUES (?, ?, ?, ?, ?)"
                , pet.getPetId(),pet.getPetName(),pet.getOwnerName(),
                pet.getPrice(), pet.getBirthDate());
        
        jdbcTemplate.update(
                "UPDATE PET SET PETNAME=?, OWNERNAME=?, PRICE=?,"
                + " BIRTHDATE=? WHERE PETID=?"
                , pet.getPetName(), pet.getOwnerName(),
                pet.getPrice(), pet.getBirthDate(), pet.getPetId());
        
        jdbcTemplate.update("DELETE FROM PET WHERE PETID=?", 
        		pet.getPetId());

        npJdbcTemplate.update(
                " INSERT INTO PET (PETID, PETNAME, OWNERNAME, PRICE, BIRTHDATE)" +
                    " VALUES (:PETID, :PETNAME, :OWNERNAME, :PRICE, :BIRTHDATE)"
                , new MapSqlParameterSource()
                .addValue("PETID", pet.getPetId())
                .addValue("PETNAME", pet.getPetName())
                .addValue("OWNERNAME", pet.getOwnerName())
                .addValue("PRICE", pet.getPrice())
                .addValue("BIRTHDATE", pet.getBirthDate())
            );
        
        jdbcTemplate.update("DELETE FROM PET WHERE PETID=?", pet.getPetId());
        
        MapSqlParameterSource map2 = new MapSqlParameterSource();
        map2.addValue("PETID", pet.getPetId());
        map2.addValue("PETNAME", pet.getPetName());
        map2.addValue("OWNERNAME", pet.getOwnerName());
        map2.addValue("PRICE", pet.getPrice());
        map2.addValue("BIRTHDATE", pet.getBirthDate());
        npJdbcTemplate.update(
            " INSERT INTO PET (PETID, PETNAME, OWNERNAME, PRICE, BIRTHDATE)" +
                " VALUES (:PETID, :PETNAME, :OWNERNAME, :PRICE, :BIRTHDATE)"
            ,map2
        );
        
        jdbcTemplate.update("DELETE FROM PET WHERE PETID=?", pet.getPetId());

         BeanPropertySqlParameterSource beanProps = new BeanPropertySqlParameterSource(pet);
        npJdbcTemplate.update(
            " INSERT INTO PET (PETID, PETNAME, OWNERNAME, PRICE, BIRTHDATE)" +
                " VALUES (:petId, :petName, :ownerName, :price, :birthDate)"
            ,beanProps
        );
        
        jdbcTemplate.update("DELETE FROM PET WHERE PETID=?", pet.getPetId());
        
    }    
  }