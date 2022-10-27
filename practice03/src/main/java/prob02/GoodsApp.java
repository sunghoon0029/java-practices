package prob02;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		
		String line = scanner.nextLine(); // 입력값 출력
//		System.out.println(line);
		String[] infos = line.split(" "); // 입력한 값을 기준으로 분할
		System.out.println(Arrays.toString(infos)); // 배열의 요소들을 한번에 보여줄 수 있는 메소드
		
		String title = infos[0];
		int price = Integer.parseInt(infos[1]);
		int countStock = Integer.parseInt(infos[2]);
		
		// 상품 출력
		
		goods[COUNT_GOODS].showInfo();
		
		// 자원정리
		scanner.close();
	}
}
