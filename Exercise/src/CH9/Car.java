package CH9;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void startCar();
	public abstract void turnOff();
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}//템플릿 메서드
}