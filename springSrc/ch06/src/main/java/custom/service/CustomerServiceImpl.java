package custom.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import custom.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	private Map<Integer,Customer> cm = 
			new HashMap<Integer,Customer>();
	private int nextId = 1;
	@PostConstruct
	public void init() {
		register(new Customer("대박","서울","k1@k1.com"));
		register(new Customer("쪽박","경기","k2@k2.com"));
		register(new Customer("졸박","울산","k3@k3.com"));
		register(new Customer("옹박","대전","k4@k4.com"));
	}
	public Customer register(Customer customer) {
		customer.setId(nextId++);
		cm.put(customer.getId(), customer);
		return customer;
	}
	public List<Customer> list() {
		return new ArrayList<Customer>(cm.values());
	}
	public Customer select(int id) {
		return cm.get(id);
	}	
	public void update(Customer customer) {
		cm.put(customer.getId(),customer);
	}
	public void delete(int id) {
		cm.remove(id);
	}
}
