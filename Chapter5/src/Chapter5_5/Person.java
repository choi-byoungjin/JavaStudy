package Chapter5_5;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}//�ڹ� �����Ϸ��� �ڵ����� �����ϴ� ����Ʈ ������

	public Person(String pname) {
		name = pname;//�̸��� �Ű������� �Է¹޾Ƽ� Person Ŭ������ �����ϴ� ������
	}
	
	public Person(String pname, float pheight, float pweight) {//�̸�, Ű, �����Ը� �Ű������� �Է¹޴� ������
		name = pname;
		height = pheight;
		weight = pweight;
	}
}