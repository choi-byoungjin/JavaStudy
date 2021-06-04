package CH9;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void startCar();
	public abstract void turnOff();
	
	public void wash() {
		System.out.println("세차를 합니다.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wash();
	}//템플릿 메서드
}