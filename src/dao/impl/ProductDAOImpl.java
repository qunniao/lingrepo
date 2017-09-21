package dao.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import dao.ProductDAO;
import entity.Product;

public class ProductDAOImpl extends HibernateDaoSupport implements ProductDAO   {
	public Product findById(int id) {
		String hql = "from Product where id="+id;
		List<Product> list = this.getSession().createQuery(hql).list();
		Iterator<Product> it = list.iterator();
		while(it.hasNext()){
			Product product = (Product)it.next();
			return product;
		}
		return null;
	}
	//修改状态
	@Override
	public void updateProduct(Product product) {
		System.out.println("ProductDAOImpl updateProduct");
		try { 
			getHibernateTemplate().update(product);	
			System.out.println("ProductDAOImpl 2");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public Product findByName(String name) {
		
		return null;
	}

	public boolean addProduct(Product product) {
		return false;
	}


	//查找正在出售商品
	public List<Product> findAll() {
		System.out.println("ProductDAOImpl findAll");
		List<Product> list = getSession().createQuery("from Product where status=1").list();
		return list;

	}
	//查找下架产品
	public List<Product> findAllxj() {
		System.out.println("ProductDAOImpl findAllxj");
		List<Product> list = getSession().createQuery("from Product where status=0").list();
		return list;

	}

	@Override
	/**
	 * Dao层查询总员工数的方法
	 */
	public int findCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from Product where status=1";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}
	@Override
	/**
	 * Dao层查询总员工数的方法
	 */
	public int findCountxj() {
		// TODO Auto-generated method stub
		String hql="select count(*) from Product where status=0";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}
	@Override
	/**
	 * Dao中查询指定页的方法
	 */
	public List<Product> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Product.class).add( Property.forName("status").eq("1") );
		List<Product> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}
	@Override
	/**
	 * Dao中查询指定页的方法
	 */
	public List<Product> findByPagexj(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Product.class).add( Property.forName("status").eq("0") );
		List<Product> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	
}
