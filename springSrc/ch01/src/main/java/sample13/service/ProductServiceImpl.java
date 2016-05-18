package sample13.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sample13.dao.ProductDao;
import sample13.model.Product;
// @Component("ps")
@Service("ps")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pd;	
	public Product getProduct() {
		return pd.getProduct("메추리알");
	}
}