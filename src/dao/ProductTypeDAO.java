package dao;

import java.util.List;

import entity.ProductType;
import entity.Store;



public interface ProductTypeDAO {
	public List<ProductType> findAll();

	int findCount();

	List<ProductType> findByPage(int begin, int pageSize);

	public List<ProductType> findById(int id);
	
	public ProductType findBy(int id);

	public boolean addProductType(ProductType productType);

	void delete(ProductType productType);

	public boolean addProductTypet(ProductType productType);


}