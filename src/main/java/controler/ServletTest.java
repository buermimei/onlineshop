package controler;
/**  
* @Title: ServletTest.java  
* @Package   
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��9��  
* @version V1.0  
*/

/**  
* @ClassName: ServletTest  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��9��  
*    
*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletTest extends HttpServlet{

	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=utf-8");
        
        String action = request.getParameter("action");  
        if("login_input".equals(action)) {  
            request.getRequestDispatcher("login.jsp").forward(request , response);  
        } else if("login".equals(action)) {  
            String name = request.getParameter("name");  
            String password = request.getParameter("password");  
              
            System.out.println("name->" + name + ",password->" + password);
        }
    }

}
