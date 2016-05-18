package ch04;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class PersonDaoImpl implements PersonDao{
	@Autowired
	private HibernateTemplate ht;
	public void addPerson(Person person) {
		ht.save(person);
	}
	public List<Person> findList() {
		return (List<Person>)ht.find("from Person");
	}
	public List<Person> findList(String id) {
		return (List<Person>)ht.find("from Person where id like ?",
				id+"%");
	}
	public Person get(String id) {
		return (Person)ht.get("ch04.Person", id);
	}
	public void removePerson(Person person) {
		ht.delete(person);		
	}
	public void updatePerson(Person person) {
		ht.update(person);		
	}
}