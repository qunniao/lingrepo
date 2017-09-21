package dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ProductTypeDAO;
import entity.Admin;
import entity.Product;
import entity.ProductType;
import entity.Store;
import entity.User;

public class ProductTypeDAOImpl extends HibernateDaoSupport implements ProductTypeDAO {
//查询所有
	@Override
	public List<ProductType> findAll() {
		System.out.println("ProductTypeDAOImpl findAll");
		List<ProductType> list = getSession().createQuery("from ProductType where pid=0 order by sort desc").list();
		return list;
	}
//通过id查询详细信息
	public List<ProductType> findById(int pid) {
		String hql = "from ProductType where pid="+pid+" order by sort desc";
		List<ProductType> list = this.getSession().createQuery(hql).list();
		Iterator<ProductType> it = list.iterator();
		System.out.println(pid);
	    System.out.println(list.size()+".......");
		while(it.hasNext()){
			ProductType productType = (ProductType)it.next();
			return list;
		}
		return null;
	}
	//通过id删除信息
		public ProductType findBy(int id) { 
			String hql = "from ProductType where id="+id;
			List<ProductType> list = this.getSession().createQuery(hql).list();
			Iterator<ProductType> it = list.iterator();
			System.out.println(id);
		    System.out.println(list.size()+".......");
			while(it.hasNext()){
				ProductType productType = (ProductType)it.next();
				return productType;
			}
			return null;
			
		}
	//新增一级菜单
	public boolean addProductType(ProductType productType) {
		System.out.println(productType.getName());
		return   (Boolean)super.getHibernateTemplate().save(productType);
	
	}
	//新增二级菜单
	public boolean addProductTypet(ProductType productType) {
		System.out.println(productType.getName());
		return   (Boolean)super.getHibernateTemplate().save(productType);
	
	}
	@Override
	/**
	 * Dao层删除方法
	 */
	public void delete(ProductType productType) {
		// TODO Auto-generated method stub 封装了
		productType.toString1();
		this.getHibernateTemplate().delete(productType);
	}
	@Override
	/**
	 * Dao层查询总员工数的方法
	 */
	public int findCount(){
		// TODO Auto-generated method stub
		String hql="select count(*) from ProductType";
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
	public List<ProductType> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(ProductType.class);
		List<ProductType> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}
	
}
