package struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.ProductTypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import dao.ProductTypeDAO;
import entity.Admin;
import entity.PageBean;
import entity.ProductType;
import entity.User;


public class ProductTypeAction extends ActionSupport implements ModelDriven<ProductType>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ProductType> list;
	ProductType productType = new ProductType();
	private ProductTypeService productTypeService;
	private int pid;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<ProductType> getList() {
		return list;
	}
	public void setList(List<ProductType> list) {
		this.list = list;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	@Resource
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}
	@Resource
	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	/* 批量删除一级菜单
	 */
	public String deleteProductTypeList(){
		System.out.println("进入删除方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		String items = request.getParameter("delitems"); 
		System.out.println(items);
		String[] item = items.split(","); 
		for (int i = 0; i < item.length; i++) { 
		//	adminService.deleteAdmin(Integer.parseInt(item[i])); 
			productType =productTypeService.findBy(Integer.parseInt(item[i]));
			
			productType.toString1();
			productTypeService.delete(productType);
			
		} 
		return "deleteProductTypeList";
	}


	
	//查询所有分类信息
			public String  getProductTypeList()throws Exception{
					list = productTypeService.findAll();
					if(list==null)list=new ArrayList();
					/*PageBean<User> pageBean = ProductTypeService.findByPage(currPage);
				// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
				ActionContext.getContext().getValueStack().push(pageBean);*/
				return "getProductTypeList";
			}
			//通过id查询
			public String getProductTypeById(){
			//没进入这个方法嗯
				HttpServletRequest request = ServletActionContext.getRequest();
				pid = Integer.parseInt(request.getParameter("pid"));
				System.out.println(pid+"aaaa..s.......");
				list = productTypeService.findById(pid);
				if(list==null)list=new ArrayList();
				// 向页面传递pid
				request.setAttribute("pid", request.getParameter("pid"));
				return "getProductTypeById";
			}
			//添加一级菜单
			public String  addProductTypeList(){
				System.out.println("添加一级菜单");
				productTypeService.addProductType(productType);
				return "addProductTypeList";
				
			}
			//添加二级菜单
			public String  addProductTypetList(){
				System.out.println("添加er级菜单"+pid);
				productTypeService.addProductTypet(productType);
				return "addProductTypetList";
				
			}
			// 当前页数
			private Integer currPage = 1;
			public void setCurrPage(Integer currPage) {
				this.currPage = currPage;
			}
			@Override
			public ProductType getModel() {
				// TODO Auto-generated method stub
				return productType;
			}
}
