package chapter6;

public class Taxi {
	String taxiName;
	int passengerCount;
	int money;

	public Taxi(String taxiNumber) {
		this.taxiName = taxiName;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("�ý�" + taxiName + "���� �°���" + passengerCount + "���̰�, ������" + money + "�Դϴ�.");
	}
}
