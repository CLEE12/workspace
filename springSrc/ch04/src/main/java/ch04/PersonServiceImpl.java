package ch04;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao pd;
	public void addPerson(Person person) {
		pd.addPerson(person);
		System.out.println("입력 성공");
	}
	public List<Person> findList() {
		return pd.findList();
	}
	public List<Person> findList(String id) {
		return pd.findList(id);
	}
	public Person get(String id) {
		return pd.get(id);
	}
	public void updatePerson(Person person) {
		pd.updatePerson(person);
	}
	public void removePerson(Person person) {
		pd.removePerson(person);
	}	
}