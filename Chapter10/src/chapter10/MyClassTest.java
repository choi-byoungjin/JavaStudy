package chapter10;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xclass = mClass;
		xclass.x();//���� �������̽� X������ �����ϸ� X�� ������ �޼��常 ȣ�� ����
		
		Y yclass = mClass;
		yclass.y();//���� �������̽� Y������ �����ϸ� Y�� ������ �޼��常 ȣ�� ����
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();//������ �������̽��� ������ �����ϸ� �������̽��� ����� ��� �޼��� ȣ�� ����
	}
}
