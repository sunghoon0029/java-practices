package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("수를 입력하시오 : ");
			int num = scanner.nextInt();

			int result = 0;

			for (int i = 0; i <= num; i++) {
				if (num % 2 == 0 && i % 2 == 0 || num % 2 != 0 && i % 2 != 0) {
					result += i;
				}
			}
			scanner.close();
		}
	}
}