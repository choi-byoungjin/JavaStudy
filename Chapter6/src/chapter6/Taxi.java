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
		System.out.println("택시" + taxiName + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
}
