 package struts.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.ProductService;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.ProductDAO;


import entity.Admin;
import entity.PageBean;
import entity.Product;



public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	private ProductDAO productdao;
	private List<Product> list;
	Product product = new Product();
	private ProductService productService;
	
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Resource
	public ProductService getProductService() {
		return productService;
	}
	@Resource
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	@Override 
	public Product getModel(){
		return product;
	}
	//查询所有会员信息
		public String  getProductList()throws Exception{
				/*list = productService.findAll();
				if(list==null)list=new ArrayList();*/
				PageBean<Product> pageBean = productService.findByPage(currPage);
			// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
			ActionContext.getContext().getValueStack().push(pageBean);
			return "getProductList";
		}
		//查询所有会员信息
		public String  getProductListxj()throws Exception{
				/*list = productService.findAll();
				if(list==null)list=new ArrayList();*/
				PageBean<Product> pageBean = productService.findByPagexj(currPage);
			// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
			ActionContext.getContext().getValueStack().push(pageBean);
			return "getProductListxj";
		}
		//通过id查询
			public String getProductById(){
			//没进入这个方法嗯
				HttpServletRequest request = ServletActionContext.getRequest();
				int id = Integer.parseInt(request.getParameter("id"));
				System.out.println(id+"查询user信息");
				product = productService.findProductById(id);
				return "getProductById";
			}
			public String updateStatus() throws Exception{
				System.out.println("updateStatus");
				HttpServletRequest request = ServletActionContext.getRequest();
				int id = Integer.parseInt(request.getParameter("id"));
				Product ad = productService.findById(id);
				ad.setStatus("0");
				setProduct(ad);
				//System.out.println("admin id"+admin.getId()+" name:"+admin.getName()+" "+admin.getStatus());
				productService.updateProduct(product);
				getProductList();
				return "getProductList";
			}
	// 当前页数
			private Integer currPage = 1;
			public void setCurrPage(Integer currPage) {
				this.currPage = currPage;
			}

			
}
