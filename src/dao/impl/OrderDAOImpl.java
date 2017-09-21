package dao.impl;


import java.util.Iterator;
import java.util.List;


import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import dao.OrderDAO;
import entity.Order;
import entity.Store;
public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO  {
	public Order findById(int id) {
		String hql = "from Order where id="+id;
		List<Order> list = this.getSession().createQuery(hql).list();
		Iterator<Order> it = list.iterator();
		while(it.hasNext()){
			Order order = (Order)it.next();
			return order;
		}
		return null;
	}


	//查找正在出售商品
	public List<Order> findAll() {
		System.out.println("OrdertDAOImpl findAll");
		List<Order> list = getSession().createQuery("from Order ").list();
		return list;

	}


	@Override
	/**
	 * Dao层查询总员工数的方法
	 */
	public int findCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from Order";
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
	public List<Order> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Order.class);
		List<Order> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	
}
