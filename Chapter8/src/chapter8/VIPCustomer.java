package chapter8;

public class VIPCustomer extends Customer {//VIPCustomer 클래스는 Customer 클래스를 상속받음
	private int agentID;	//VIP 고객 상담원 아이디
	double saleRatio;		//할인율
	
	public VIPCustomer() {
		super(customerID, customerName);//상위 클래스 생성자 호출
		customerGrade = "VIP";//상위 클래스에서 private 변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
	    System.out.println("VIPCustomer( ) 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
