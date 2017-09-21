package service.impl;

import java.util.List;

import service.ProductService;

import dao.ProductDAO;
import entity.PageBean;
import entity.Product;

public class ProductServiceImpl implements ProductService {
         private ProductDAO productDAO;
		//提供UserDAO对象的注入通道
		public void setProductDAO(ProductDAO productDAO){
			this.productDAO = productDAO;
		}
		//添加用户
		public void saveProduct(Product product){
			if(productDAO.findById(product.getId())==null){
				productDAO.addProduct(product);
			}
		}
		
		public Product getProduct(String name) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public void deleteProduct(int id) {
			// TODO Auto-generated method stub
			
		}

		public void updateProduct(Product product) {
			productDAO.updateProduct(product);
			
		}
		
		public Product findProductById(int id) {
			// TODO Auto-generated method stub
			return productDAO.findById(id);
		}
		
		public List<Product> findAll() {
				System.out.println("ProductServiceImpl findAll");
				return productDAO.findAll();
			}
		public List<Product> findAllxj() {
			System.out.println("ProductServiceImpl findAllxj");
			return productDAO.findAllxj();
		}
		@Override
		public PageBean<Product> findByPage(Integer currPage) {
			// TODO Auto-generated method stub
			  PageBean<Product> pageBean = new PageBean<Product>();
		        // 封装当前页数
		        pageBean.setCurrPage(currPage);
		        // 封装每页记录数
		        int pageSize = 5;
		        pageBean.setPageSize(pageSize);
		        // 封装总记录数
		        int totalCount = productDAO.findCount();
		        pageBean.setTotalCount(totalCount);
		        // 封装页数
		        int totalPage;
		        if(totalCount%pageSize==0){
		        	totalPage = totalCount/pageSize;
		        }else{
		        	totalPage = totalCount/pageSize + 1; 
		        }
		        pageBean.setTotalPage(totalPage);
		        // 封装当前页记录
		        int begin= (currPage - 1)*pageSize;
		        List<Product> list = productDAO.findByPage(begin, pageSize);
		        pageBean.setList(list);
				return pageBean;
		}
		@Override
		public PageBean<Product> findByPagexj(Integer currPage) {
			// TODO Auto-generated method stub
			  PageBean<Product> pageBean = new PageBean<Product>();
		        // 封装当前页数
		        pageBean.setCurrPage(currPage);
		        // 封装每页记录数
		        int pageSize = 5;
		        pageBean.setPageSize(pageSize);
		        // 封装总记录数
		        int totalCount = productDAO.findCountxj();
		        pageBean.setTotalCount(totalCount);
		        // 封装页数
		        int totalPage;
		        if(totalCount%pageSize==0){
		        	totalPage = totalCount/pageSize;
		        }else{
		        	totalPage = totalCount/pageSize + 1; 
		        }
		        pageBean.setTotalPage(totalPage);
		        // 封装当前页记录
		        int begin= (currPage - 1)*pageSize;
		        List<Product> list = productDAO.findByPagexj(begin, pageSize);
		        pageBean.setList(list);
				return pageBean;
		}
		@Override
		public Product findById(int id) {
			// TODO Auto-generated method stub
			return productDAO.findById(id);
		}
	}


