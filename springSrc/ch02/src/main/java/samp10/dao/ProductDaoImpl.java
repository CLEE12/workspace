package samp10.dao;
import org.springframework.stereotype.Repository;

import samp10.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	public Product getProduct(String name) {
		return new Product(name, 30000);
	}
}