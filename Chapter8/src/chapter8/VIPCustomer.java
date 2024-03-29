package chapter8;

public class VIPCustomer extends Customer {//VIPCustomer 클래스는 Customer 클래스를 상속받음
	private int agentID;	//VIP 고객 상담원 아이디
	double saleRatio;		//할인율
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {//재정의한 메서드
		bonusPoint += price * bonusRatio;//보너스 포인트 적립
		return price - (int)(price * saleRatio);//할인된 가격을 계산하여 반환
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다";
	}//고객 정보 출력 메서드 재정의
	
	public int getAgentID() {
		return agentID;
	}
}
