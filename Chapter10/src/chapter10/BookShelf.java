package chapter10;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}//�迭�� ��� �߰�

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}//�� ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ

	@Override
	public int getSize() {
		return getCount();
	}//�迭 ��� ���� ��ȯ

}
