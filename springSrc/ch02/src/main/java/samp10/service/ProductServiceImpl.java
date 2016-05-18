package samp10.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import samp10.dao.ProductDao;
import samp10.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pd;
	public Product getProduct() {
		return pd.getProduct("핏자");		
	}
}