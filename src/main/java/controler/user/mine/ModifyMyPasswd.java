/**  
* @Title: ModifyMyAddress.java  
* @Package controler.user.mine  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler.user.mine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;

/**
 * @author SongKaikai
 *
 */
public class ModifyMyPasswd extends HttpServlet{
	Customer customer = new Customer();

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
		super.doPost(req, resp);
		customer.modifyPasswd(oldPasswd, newPasswd);
	}
	

}