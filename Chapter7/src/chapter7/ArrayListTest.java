package chapter7;
import java.util.ArrayList;//ArrayList Ŭ���� import

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();//ArrayList ����
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));//add()�޼���� ��� �� �߰�
		
		for(int i = 0; i <library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}//�迭�� �߰��� ��� ������ŭ ���
		System.out.println( );
		
		System.out.println("=== ���� for�� ��� ===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
