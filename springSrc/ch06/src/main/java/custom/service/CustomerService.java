package custom.service;
import java.util.List;
import custom.model.Customer;
public interface CustomerService {
	List<Customer> list();
	Customer select(int id);
	Customer register(Customer customer);
	void update(Customer customer);
	void delete(int id);
}