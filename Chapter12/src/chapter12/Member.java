package chapter12;

public class Member {
	private int memberId; //ȸ�� ���̵�
	private String memberName; //ȸ�� ���̵�
	//�Ӽ�
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String mamberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}//toString() �޼��� ������
}
