package chapter10;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();//�����ǵ� �޼��� ȣ���
		
		Sell seller = customer;
		seller.sell();
		seller.order();//�����ǵ� �޼��� ȣ���
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();//�����ǵ� �޼��� ȣ���
	}

}
