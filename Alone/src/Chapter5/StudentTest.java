package Chapter5;

import Chapter5.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "인천 부평구";
		studentLee.setStudentName("이방원");
		
		System.out.println(studentLee.getStudentName());

	}

}
