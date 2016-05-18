package ch04;
import java.util.List;
public interface PersonDao {
	void addPerson(Person person);
	List<Person> findList();
	List<Person> findList(String id);
	Person get(String id);
	void removePerson(Person person);
	void updatePerson(Person person);
}