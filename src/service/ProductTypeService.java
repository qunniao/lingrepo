package service;

import java.util.List;

import entity.PageBean;
import entity.ProductType;


// 你这里怎么没复制
public interface ProductTypeService {
  List<ProductType> findAll();//查找全部用户

PageBean<ProductType> findByPage(Integer currPage);

List<ProductType> findById(int id);

ProductType findBy(int id);

void addProductType(ProductType productType);

void delete(ProductType productType);

void addProductTypet(ProductType productType);


}