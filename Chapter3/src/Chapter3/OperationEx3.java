package Chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);//논리 곱에서 앞 항의 결과 값이 거짓이므로 뒷 항은 실행되지 않는다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);//논리 합에서 앞 항의 결과 값이 참이므로 뒷 항은 실행되자 않는다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
//나머지 항이 실행되지 않는 것을 '단락 회로 평가'(Short Circuit Evaluation; SCE)라 한다.
}
