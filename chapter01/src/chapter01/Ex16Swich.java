package chapter01;

public class Ex16Swich {
	public static void main(String[] args) {
		char grade = ' ';
		int score = 52;
		
		switch(score / 10) {
			case 10: 		// score = 100
			case 9: {		// 90 <= score <= 99
				grade = 'A';
				break;
			}
			case 8: {		// 80 <= score <= 89
				grade = 'B';
				break;
			}
			case 7: {		// 70 <= score <= 79
				grade = 'C';
				break;
			}
			case 6: {		// 60 <= score <= 69
				grade = 'D';
				break;
			}
			default: {
				grade = 'F';
				break;
			}
		}
		

		System.out.println("학점은 " + grade + "입니다.");

	}

}
