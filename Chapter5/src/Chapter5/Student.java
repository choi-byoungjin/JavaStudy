package Chapter5;

public class Student {//클래스 이름은 첫글자 대문자로 한다
	int studentID;		//학번
	private String studentName;	//학생 이름
	int grade;			//학년
	String address;		//사는 곳 : 멤버 변수(속성)
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);//이름, 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
//	public void setStudentName(String name) {
//		studentName = name;
//	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
