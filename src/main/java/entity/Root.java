/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

/**
 * @author YWB
 *
 */
public class Root extends Admin {
	public Admin[] admins;
	/**  
	* ����һ���µ�ʵ�� Root.  
	*    
	*/
	public Root() {
		admins = findAdmin();
	}
	
	
	
	/**  
	* @Title: findAdmin  
	* @Description: ��ѯ����Ա��Ϣ
	* @param @param admin
	* @param @return    ����  
	* @return Admin[]    ��������  
	* @throws  
	*/  
	public Admin[] findAdmin() {
		
		return null;
	}
	
	/**  
	* @Title: deleteAdmin  
	* @Description: ɾ�������е�admin
	* @param @param admin
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean deleteAdmin(Admin admin) {
		return true;
	}
	
	
	/**  
	* @Title: addAdmin  
	* @Description: �˺������������ã��������ݿ���һ�β�ѯ������鵽�й���Ա�����޸���Ϣ�����û��������һ����¼  
	* @param @param admin
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean addAdmin(Admin admin) {
		
		return true;
		
	}
	

}
