package chapter6;

public class Student {
	public String studentName;	//�л� �̸�
	public int grade;			//�г�
	public int money;			//�л��� ������ �ִ� ��
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}	//�л� �̸��� ���� ���� �Ű������� �޴� ������
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�Դϴ�.");
	}
	
}
