/**  
* @Title: Index.java  
* @Package controler  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
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
import entity.User;

/**
 * @author SongKaikai
 *
 */

public class Index extends HttpServlet{
	
	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
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
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		
		String name = req.getParameter("kickname");
		String passwd = req.getParameter("password");
		String id = req.getParameter("address");
		user.setName(name);
		user.setPasswd(passwd);
		user.setId(id);
		User user1;
		try {
			user1 = user.logIn(user);
			if (user1!=null) {
				resp.sendRedirect(req.getContextPath()+"/user/userhomepage.jsp");
				return;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		resp.sendRedirect(req.getContextPath() + "/root/root.jsp");
		return;
	
		
	}
	

}
