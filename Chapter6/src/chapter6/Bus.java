package chapter6;

public class Bus {
	int busNumber;				//���� ��ȣ
	int passengerCount;			//�°� ��
	int money;					//���� ����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}	//���� ��ȣ�� �Ű������� �޴� ������
	
	public void take(int money) {
		this.money += money;	//���� ���� ����
		passengerCount++;		//�°� �� ����
	}	//�°��� ������ ź ��츦 ������ �޼���
	
	public void shoeInfo() {
		System.out.println("����" + busNumber + "���� �°���" + passengerCount + "���̰�, ������" + money + "�Դϴ�.");
	}	//���� ������ ����ϴ� �޼���
}
