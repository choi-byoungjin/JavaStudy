package chapter8;

public class Customer {
	protected int customerID;			//�� ���̵�
	protected String customerName;	//�� �̸�
	protected String customerGrade;	//�� ���
	int bonusPoint;					//���ʽ� ����Ʈ
	double bonusRatio;				//���� ����
	//��� ����
	public Customer() {
		initCustomer()
	}//����Ʈ ������
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer()//�� ��ް� ���ʽ� ����Ʈ ������ ���� �Լ� ȣ��
	}
	
	private void initCustomer() {//�����ڿ����� ȣ���ϴ� �޼����̹Ƿ� private���� ����
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}//��� ������ �ʱ�ȭ �κ�
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}//protected ������ ������ ������ �ܺο��� ����� �� �ֵ��� get(), set() �޼��� �߰�

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;//���ʽ� ����Ʈ ���
		return price;
	}//���ʽ� ����Ʈ ����, ���Ұ��� ��� �޼���
	
	public String showCustomerInfo() {
		return customerName + " ���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
	
}
