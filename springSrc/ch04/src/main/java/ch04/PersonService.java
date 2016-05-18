package ch04;
import java.util.List;
public interface PersonService {
	void addPerson(Person person);
	List<Person> findList();
	List<Person> findList(String id);
	Person get(String id);
	void updatePerson(Person person);
	void removePerson(Person person);
}