package Chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		//studentAhn.studentName = "�Ƚ¿�";
		studentAhn.setStudentName("�Ƚ¿�");
		//System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
