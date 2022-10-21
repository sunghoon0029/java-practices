package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("수를 입력하시오 : ");
		int num = scanner.nextInt();
		
		
		int result = 0;
		if (num % 2 != 0) {
			for(int i = 1; i <= num; i = i+2) {
				result += i; 
			}
			System.out.println(result);
		}else {
			for(int j = 0; j <= num; j = j+2) {
				result += j; 
			}
			System.out.println(result);
		}

		scanner.close();
	}
}
