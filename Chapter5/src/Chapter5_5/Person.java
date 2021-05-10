package Chapter5_5;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person(String pname) {
		name = pname;//이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
	}
	public Person() {}//자바 컴파일러가 자동으로 제공하는 디폴트 생성자
}
