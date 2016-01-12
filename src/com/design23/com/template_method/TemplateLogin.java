package com.design23.com.template_method;


/**  
 * @Name:   
 * @author KingJA    
 * @date 2015-12-5 ����4:28:47  
 * @version V1.0  
 * @Description:     
 */
public class TemplateLogin {
	public final boolean  checkLogin(String userName,String password){
		if (checkFormat(userName,password)) {
			password=getEncyptedPassword(password);
			return checkUserExist(userName,password);
		}
		
		return false;
	}

	/**
	 * �̶��㷨
	 * ����û��Ƿ����
	 * @param userName
	 * @param password
	 * @return
	 */
	private final boolean checkUserExist(String userName, String password) {
		// ���ݿ����û��Ƿ���ڣ������߼�ʡ��
		if ("admin".equals(userName)&&"admin".equals(password)) {
			System.out.println("���ݿ��飺���ڸ��û�");
			
			return true;
		}
		System.out.println("���ݿ��飺�����ڸ��û�");
		return false;
	}

	/**
	 * �������ʵ��
	 * ��������㷨��public ���������ʵ��
	 * @param password
	 * @return
	 */
	public String getEncyptedPassword(String password) {
		return password;
	}

	/**
	 * �̶��㷨
	 * ����û�����ʽ�����÷ǿ��жϴ���
	 * @param userName
	 * @param password
	 * @return
	 */
	private final boolean checkFormat(String userName, String password) {
		if (userName!=""&&password!="") {
			System.out.println("��ʽ��飺��ȷ");
			return true;
		}
		System.out.println("��ʽ��飺����");
		return false;
	}

}
