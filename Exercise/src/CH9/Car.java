package CH9;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void startCar();
	public abstract void turnOff();
	
	public void wash() {
		System.out.println("������ �մϴ�.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wash();
	}//���ø� �޼���
}