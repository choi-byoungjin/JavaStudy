package chapter11;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}//책 번호와 제목을 매개변수로 입력받는 생성자
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}//toString() 메서드 재정의
}
public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);//인스턴스 정보(클래스 이름.주소 값)
		System.out.println(book1.toString());//toString() 메서드로 인스턴스 정보(클래스 이름.주소 값)를 보여 줌
	}

}
