package chapter8;

public class VIPCustomer extends Customer {//VIPCustomer Ŭ������ Customer Ŭ������ ��ӹ���
	private int agentID;	//VIP �� ���� ���̵�
	double saleRatio;		//������
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {//�������� �޼���
		bonusPoint += price * bonusRatio;//���ʽ� ����Ʈ ����
		return price - (int)(price * saleRatio);//���ε� ������ ����Ͽ� ��ȯ
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�";
	}//�� ���� ��� �޼��� ������
	
	public int getAgentID() {
		return agentID;
	}
}
