package CH9;

public class Genesis extends Car {

	@Override
	public void drive() {
		System.out.println("Genesis �޸��ϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("Genesis ����ϴ�.");
		
	}

	@Override
	public void startCar() {
		System.out.println("Genesis �õ��� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
	
}
