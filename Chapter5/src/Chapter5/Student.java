package Chapter5;

public class Student {//Ŭ���� �̸��� ù���� �빮�ڷ� �Ѵ�
	int studentID;		//�й�
	private String studentName;	//�л� �̸�
	int grade;			//�г�
	String address;		//��� �� : ��� ����(�Ӽ�)
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);//�̸�, �ּ� ���
	}
	
	public String getStudentName() {
		return studentName;
	}
	
//	public void setStudentName(String name) {
//		studentName = name;
//	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
