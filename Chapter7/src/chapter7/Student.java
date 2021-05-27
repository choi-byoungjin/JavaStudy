package chapter7;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;//ArrayList �����ϱ�
	//Student Ŭ������ ��� ����
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<subject>();//ArrayList �����ϱ�
	}//������
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();	//Subject �����ϱ�
		subject.setName(name);				//���� �̸� �߰��ϱ�
		subject.setScorePoint(score);		//���� �߰��ϱ�
		subjectList.add(subject);			//�迭�� �����ϱ�
	}//�л��� �����ϴ� ������ subjectList �迭�� �ϳ��� �߰��ϴ� �޼���
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л�" + studentName + "��" + s.getName() + "��������" + s.getScorePoint() + "�Դϴ�.");
		}//�迭 ��� �� ���
		System.out.println("�л�" + studentName + "�� ������" + total + "�Դϴ�.");
	}
	
}
