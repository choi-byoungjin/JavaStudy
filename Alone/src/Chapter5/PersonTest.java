package Chapter5;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.age = 40;
		person.isMarried = true;
		person.name = "james";
		person.numberOfChildren = 3;
		
		System.out.println("���� : " + person.age);
		System.out.println("�̸� : " + person.name);
		System.out.println("��ȥ ���� : " + person.isMarried);
		System.out.println("�ڳ� �� : " + person.numberOfChildren);

	}

}
