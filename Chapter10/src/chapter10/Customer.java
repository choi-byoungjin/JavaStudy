package chapter10;

public class Customer implements Buy, Sell{//Customer 클래스는 Buy와 Sell인터페이스를 모두 구현함

	@Override
	public void sell() {
		System.out.println("구매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
		
	}

}
