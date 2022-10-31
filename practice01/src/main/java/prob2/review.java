package prob2;

public class review {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			for (int j = i + 1; j <= i + 9; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

//1 2 3 4 5 6 7 8 9 10
//2 3 4 5 6 7 8 9 10 11
//3 4 5 6 7 8 9 10 11 12
//4 5 6 7 8 9 10 11 12 13
//5 6 7 8 9 10 11 12 13 14
//6 7 8 9 10 11 12 13 14 15
//7 8 9 10 11 12 13 14 15 16
//8 9 10 11 12 13 14 15 16 17
//9 10 11 12 13 14 15 16 17 18
//10 11 12 13 14 15 16 17 18 19