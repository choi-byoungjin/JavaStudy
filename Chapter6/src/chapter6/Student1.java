package chapter6;

public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;	//�л��� ������ ������ ����
		studentID = serialNum;	//������ ���� �й� �ν��Ͻ� ������ �ο�
	}	//������
	
	public String getStucentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
