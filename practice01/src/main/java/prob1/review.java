package prob1;

import java.util.Scanner;

public class review {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("수를 입력하세요: ");
		int s = scanner.nextInt();

		if (s % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		scanner.close();
	}
}
