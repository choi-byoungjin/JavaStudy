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
	
	public int getAgentID() {
		return agentID;
	}
}
