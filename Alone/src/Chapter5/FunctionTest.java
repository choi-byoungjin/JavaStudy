package Chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		int minus = sub(num1, num2);
		int multiple = mul(num1, num2);
		int division = div(num1, num2);
		
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiple);
		System.out.println(division);

	}
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
