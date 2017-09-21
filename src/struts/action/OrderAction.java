 package struts.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import service.OrderService;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.OrderDAO;

import entity.Order;
import entity.PageBean;




public class OrderAction extends ActionSupport implements ModelDriven<Order>{

	private OrderDAO orderdao;
	private List<Order> list;
	Order order = new Order();
	private OrderService orderService;
	

	@Override 
	public Order getModel(){
		return order;
	}
	//查询所有会员信息
		public String  getOrderList()throws Exception{
				/*list = productService.findAll();
				if(list==null)list=new ArrayList();*/
				PageBean<Order> pageBean = orderService.findByPage(currPage);
			// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
			ActionContext.getContext().getValueStack().push(pageBean);
			return "getOrderList";
		}
		
		//通过id查询
			public String getOrderById(){
			//没进入这个方法嗯
				HttpServletRequest request = ServletActionContext.getRequest();
				int id = Integer.parseInt(request.getParameter("id"));
				System.out.println(id+"查询order信息");
				order = orderService.findById(id);
				return "getOrderById";
			}
		
			private Integer currPage = 1;
			public OrderDAO getOrderdao() {
				return orderdao;
			}
			public void setOrderdao(OrderDAO orderdao) {
				this.orderdao = orderdao;
			}
			public List<Order> getList() {
				return list;
			}
			public void setList(List<Order> list) {
				this.list = list;
			}
			public Order getOrder() {
				return order;
			}
			public void setOrder(Order order) {
				this.order = order;
			}
			public OrderService getOrderService() {
				return orderService;
			}
			public void setOrderService(OrderService orderService) {
				this.orderService = orderService;
			}
			public void setCurrPage(Integer currPage) {
				this.currPage = currPage;
			}

			
}
