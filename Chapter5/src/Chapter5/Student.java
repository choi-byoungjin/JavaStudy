package Chapter5;

public class Student {//Ŭ���� �̸��� ù���� �빮�ڷ� �Ѵ�
	int studentID;		//�й�
	String studentName;	//�л� �̸�
	int grade;			//�г�
	String address;		//��� �� : ��� ����(�Ӽ�)
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);//�̸�, �ּ� ���
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
