package chapter8;

public class VIPCustomer extends Customer {//VIPCustomer Ŭ������ Customer Ŭ������ ��ӹ���
	private int agentID;	//VIP �� ���� ���̵�
	double saleRatio;		//������
	
	public VIPCustomer() {
		customerGrade = "VIP";//���� Ŭ�������� private �����̹Ƿ� ���� �߻�
		bonusRatio = 0.05;
		saleRatio = 0.1;
	    System.out.println("VIPCustomer( ) ������ ȣ��");
	}
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int calcPrice(int price) {//�������� �޼���
		bonusPoint += price * bonusRatio;//���ʽ� ����Ʈ ����
		return price - (int)(price * saleRatio);//���ε� ������ ����Ͽ� ��ȯ
	}
	
	public int getAgentID() {
		return agentID;
	}
}
