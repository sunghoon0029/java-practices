package prob4;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		
		int length = str.length();
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println("");
		}
		scanner.close();		
	}
}
