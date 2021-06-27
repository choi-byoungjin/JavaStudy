package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");//���ο� ȸ�� �ν��Ͻ� ����
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);//ArrayList�� ȸ�� �߰�
		
		memberArrayList.showAllMember();//��ü ȸ�� ���
		
		memberArrayList.removeMember(memberHong.getMemberId());//ȫ�浿 ȸ�� ����
		memberArrayList.showAllMember();//ȫ�浿 ȸ���� ������ �� �ٽ� ��ü ȸ�� ���
	}

}
