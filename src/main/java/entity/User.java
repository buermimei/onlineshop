/**  
* @Title: User.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��15��  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: User  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��15��  
*    
*/
public class User {
	private String passwd;
	private String id;
	private String name;
	
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd Ҫ���õ� passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param user �����½�ߵ���Ϣ
	 * @return �û���Ϣ���ڣ������û���Ϣ������weinull
	 * */
	public User logIn(User user) {
		return null;
	}

}
