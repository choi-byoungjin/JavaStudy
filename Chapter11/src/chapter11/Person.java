package chapter11;

public class Person {
	private String name;
	private int age;
	
	public Person() {}//����Ʈ ������
	
	public Person(String name) {
		this.name = name;
	}//�̸��� �Է¹޴� ������
	
	public Person(String anme, int age) {
		this.name = name;
		this.age = age;
	}//�̸��� ���̸� �Է¹޴� ������
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
