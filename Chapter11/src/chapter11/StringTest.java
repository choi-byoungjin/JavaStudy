package chapter11;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);//�ν��Ͻ��� �Ź� ���� �����ǹǷ� str1�� str2�� �ּ� ���� �ٸ�
		System.out.println(str1.equals(str2));//���ڿ� ���� �����Ƿ� true ��ȯ
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);//���ڿ� abc�� ��� Ǯ�� ����� �����Ƿ� str3�� str4�� ����Ű�� �ּ� ���� ����
		System.out.println(str3.equals(str4));//���ڿ� ���� �����Ƿ� true ��ȯ

	}

}
