package com.design23.com.template_method;

/**  
 * @Name:   
 * @author KingJA    
 * @date 2015-12-5 ����7:21:27  
 * @version V1.0  
 * @Description:     
 */
public class AdminLogin extends TemplateLogin {
	@Override
	public String getEncyptedPassword(String password) {
		System.out.println("������ܣ�����Ա��¼������");
		return super.getEncyptedPassword(password);
	}

}
