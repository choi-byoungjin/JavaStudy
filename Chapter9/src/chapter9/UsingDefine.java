package chapter9;

public class UsingDefine {

	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);//static���� ���������Ƿ� �ν��Ͻ��� ���������ʰ� Ŭ������ �̸����� ���� ����
		System.out.println("�ּڰ��� " + Define.MIN + "�Դϴ�.");
		System.out.println("�ִ��� " + Define.MAX + "�Դϴ�.");
		System.out.println("���� ���� �ڵ� ���� " + Define.MATH + "�Դϴ�.");
		System.out.println("���� ���� �ڵ� ���� " + Define.ENG + "�Դϴ�.");
	}

}