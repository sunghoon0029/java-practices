package chapter01;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator
		System.out.println(a + b); // 10
		System.out.println(a - b); // -4
		System.out.println(a * b); // 21
		System.out.println(a / b); // 0
		System.out.println(a % b); // 3

		// unary operator
		System.out.println(-a); // -3
		
		++a;
		// a += 1;
		// a = a + 1;
		System.out.println(a); //4
		
		a++;
		// a += 1;
		// a = a + 1;
		System.out.println(a); //5
		
		System.out.println(a++); //5 출력 후 +
		System.out.println(a); //6
		System.out.println(++a); //7 + 후 출력
		System.out.println(a); //7
		
		System.out.println(--a); //6
		System.out.println(a); //6
		System.out.println(a++); //6
		System.out.println(a); //7
	}

}
