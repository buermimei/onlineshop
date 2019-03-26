/**  
* @Title: Index.java  
* @Package controler  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.websocket.CaseInsensitiveKeyMap;

import entity.Admin;
import entity.Customer;
import entity.User;

/**
 * @author SongKaikai
 *
 */

public class Index extends HttpServlet{
	
	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = -7356128917124282172L;
	private User user = new User();
	/**
	* <p>Title: doGet</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		super.doGet(req, resp);
	}
	/**
	* <p>Title: doPost</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		
		String name = req.getParameter("kickname");
		String passwd = req.getParameter("password");
		String id = req.getParameter("address");
		user.setName(name);
		user.setPasswd(passwd);
		user.setId(id);
		Admin currentAdmin;
		Customer currentCustomer;
		
		try {
			if (user.getName().equals("admin")) {
				currentAdmin =  (Admin) user.logIn(user);
				if (currentAdmin!=null) {
					int kind = currentAdmin.getState();
					switch (kind) {
					case Admin.finance_adm:
						resp.sendRedirect(req.getContextPath()+"/financialmanager/financialmanager.jsp");
						break;
					case Admin.aftersale_adm:
						resp.sendRedirect(req.getContextPath()+"/aftersalesmanager/aftersalesmanager.jsp");
						break;
					case Admin.root_adm:
						resp.sendRedirect(req.getContextPath()+"/root/root.jsp");
						break;
					case Admin.product_adm:
						resp.sendRedirect(req.getContextPath()+"/user/productmanager.jsp");
						break;
					case Admin.order_adm:
						resp.sendRedirect(req.getContextPath()+"/ordermanager/ordermanager.jsp");
						break;

					default:
						break;
					}
					
					return;
				}
			} else {

				currentCustomer = (Customer)user.logIn(user);
				if (currentCustomer!=null) {
					resp.sendRedirect(req.getContextPath()+"/user/userhomepage.jsp");
					return;
				}
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		resp.sendRedirect(req.getContextPath() + "/root/root.jsp");
		return;
	
		
	}
	

}
