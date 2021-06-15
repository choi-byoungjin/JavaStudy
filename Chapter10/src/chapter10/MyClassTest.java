package chapter10;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xclass = mClass;
		xclass.x();//상위 인터페이스 X형으로 대입하면 X에 선언한 메서드만 호출 가능
		
		Y yclass = mClass;
		yclass.y();//상위 인터페이스 Y형으로 대입하면 Y에 선언한 메서드만 호출 가능
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();//구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메서드 호출 가능
	}
}
