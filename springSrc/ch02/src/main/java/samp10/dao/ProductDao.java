package samp10.dao;

import samp10.model.Product;

public interface ProductDao {
	Product getProduct(String name);
}