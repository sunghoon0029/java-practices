package prob3;

import java.util.Scanner;

public class review {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();

		int i = 0;
		int sum = 0;

		if (num % 2 == 1) {
			for (i = 1; i <= num; i += 2) {
				sum += i;
			}
		} else {
			for (i = 2; i <= num; i += 2) {
				sum += i;
			}
		}

		System.out.println("결과값: " + sum);
		scanner.close();
	}
}
