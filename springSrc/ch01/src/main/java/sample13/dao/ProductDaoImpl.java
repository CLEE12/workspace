package sample13.dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sample13.model.Product;
// @Component
@Repository
public class ProductDaoImpl implements ProductDao{
	public Product getProduct(String name) {
		return new Product(name,500);
	}
}