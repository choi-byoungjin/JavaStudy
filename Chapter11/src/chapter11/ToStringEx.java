package chapter11;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}//å ��ȣ�� ������ �Ű������� �Է¹޴� ������
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}
public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "����");
		
		System.out.println(book1);//�ν��Ͻ� ����(Ŭ���� �̸�.�ּ� ��)
		System.out.println(book1.toString());//toString() �޼���� �ν��Ͻ� ����(Ŭ���� �̸�.�ּ� ��)�� ���� ��
	}

	@Override
}
