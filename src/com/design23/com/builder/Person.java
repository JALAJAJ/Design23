package com.design23.com.builder;

/**  
 * @Name: ������ģʽ
 * @author KingJA    
 * @date 2015-11-15 ����2:09:12  
 * @version V1.0  
 * @Description:ͨ�����ڲ����϶�����á�     
 */
public class Person {
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender
				+ "]";
	}
	private Person (Builder builder){
		this.age=builder.age;
		this.name=builder.name;
		this.gender=builder.gender;
		
	}
	private int age;
	private String name;
	private Gender gender;
	public enum Gender{
		MAN,WOMAN
	}
	public static class Builder{
		private int age;
		private String name;
		private Gender gender;
		public Builder setAge(int age){
			this.age=age;
			return this;
		}
		
		public Builder setName(String name){
			this.name=name;
			return this;
		}
		public Builder setGender(Gender gender){
			this.gender=gender;
			return this;
		}
		public Person create(){
			return new Person(this);
		}
		
	}
	

}
