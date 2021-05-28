package chapter8;

public class Customer {
	private int customerID;			//�� ���̵�
	private String customerName;	//�� �̸�
	private String customerGrade;	//�� ���
	int bonusPoint;					//���ʽ� ����Ʈ
	double bonusRatio;				//���� ����
	//��� ����
	public Customer() {
		customerGrade = "SILVER";	//�⺻ ���
		bonusRatio = 0.01;			//���ʽ� ����Ʈ �⺻ ���� ����
	}//����Ʈ ������
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;//���ʽ� ����Ʈ ���
		return price;
	}//���ʽ� ����Ʈ ����, ���Ұ��� ��� �޼���
	
	public String showCustomerInfo() {
		return customerName + " ���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
	
}
