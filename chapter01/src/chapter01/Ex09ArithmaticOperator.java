package chapter01;

public class Ex09ArithmaticOperator {

	public static void main(String[] args) {
		System.out.println(10.0 / 3.0); // double 결과
		System.out.println(10.0 / 3); // double 결과
		System.out.println(10 / 3.0); // double 결과
		System.out.println(10 / 3); // int 결과
		System.out.println((double)(10 / 3));
		System.out.println((double)10 / 3);
		
		System.out.println(44 % 3);
		System.out.println(-7 % 3);
		System.out.println(7 % -3);

	}

}
