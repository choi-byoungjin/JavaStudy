package chapter6;

public class Subway {
	String lineNumber;		//����ö �뼱
	int passengerCount;		//�°� ��
	int money;				//���Ծ�
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}	//����ö �뼱 ��ȣ�� �Ű������� �޴� ������
	
	public void take(int money) {
		this.money += money;	//���� ����
		passengerCount++;		//�°� �� ����
	}	//�°��� ����ö�� ź ��츦 ������ �޼���
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°���" + passengerCount +"���̰�, ������ "+ money + "�Դϴ�.");
	}	//����ö ���� ����ϴ� �޼���
}
