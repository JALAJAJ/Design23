package com.design23.com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import com.design23.com.builder.Person;
import com.design23.com.builder.Person.Gender;
import com.design23.com.single.SingleInstanceDCL;
import com.design23.com.template_method.AdminLogin;
import com.design23.com.template_method.TemplateLogin;
import com.design23.com.template_method.UserLogin;

/**
 * @Name:
 * @author KingJA
 * @date 2015-11-15 ����2:35:45
 * @version V1.0
 * @Description:
 */
public class Main {
	public static void main(String[] args) {
//		testByPosition(3);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(simpleDateFormat.format(new Date()));
	
	}

	public static void testByPosition(int position) {
		switch (position) {
		// ����ģʽ
		case 1:
			mSingleInstanceTest();
			break;
		// ������ģʽ
		case 2:
			mBuilderTest();
			break;
			// ģ�巽��ģʽ
		case 3:
			mTemplateMethodTest();
			break;

		default:
			break;
		}
	}

	/**
	 * 3.ģ�巽��ģʽ
	 */
	private static void mTemplateMethodTest() {
		TemplateLogin userLogin = new UserLogin();
		TemplateLogin adminLogin = new AdminLogin();
		userLogin.checkLogin("admin", "admin");
		adminLogin.checkLogin("admin", "admin");
	}

	/**
	 * 1.����ģʽ
	 */
	private static void mSingleInstanceTest() {
		SingleInstanceDCL instanceA = SingleInstanceDCL.getInstance();
		SingleInstanceDCL instanceB = SingleInstanceDCL.getInstance();
		System.out.println("instanceA="+instanceA.toString());
		System.out.println("instanceB="+instanceB.toString());

	}

	/**
	 * 2.������ģʽ
	 */
	private static void mBuilderTest() {
		Person.Builder builder = new Person.Builder();
		Person person = builder.setAge(18).setName("Genius").setGender(Gender.MAN)
				.create();
		System.out.println(person.toString());
	}

}
