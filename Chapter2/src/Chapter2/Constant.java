package Chapter2;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100;//선언 동시에 초기화//final 예약어로 상수 선언
		final int MIN_NUM;
		
		MIN_NUM = 0;//사용 전 초기화 필요
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; //상수는 값 변경 불가

	}

}
