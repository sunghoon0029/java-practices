package prob5;

public class review {

	public static void main(String[] args) {
		for(int i = 1; i <100; i++) {
			String s = String.valueOf(i);
			
			int length = s.length();
			int clap = 0;
			
			for(int j = 0; j <length; j++) {
				char c = s.charAt(j);
				if(c == '3' || c == '6' || c == '9') {
					clap++;
				}
			}
			
			if(clap == 0) {
				continue;
			}
			
			System.out.println(s + " ");
			
			for(int j = 0; j < clap; j++) {
				System.out.println(" 짝! ");
			}
			
			System.out.println("\n");
		}
	}
}
