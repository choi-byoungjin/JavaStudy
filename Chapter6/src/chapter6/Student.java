package chapter6;

public class Student {
	public String studentName;	//�л� �̸�
	public int grade;			//�г�
	public int money;			//�л��� ������ �ִ� ��
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}	//�л� �̸��� ���� ���� �Ű������� �޴� ������
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}	//�л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}	//�л��� ����ö�� Ÿ�� 1500���� �����ϴ� ����� ������ �޼���
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�Դϴ�.");
	}	//�л��� ���� ������ ����ϴ� �޼���
	
}
