package thread;

import java.util.HashSet;
import java.util.Set;

import collection.Gugudan;

public class HashSetTest02 {

	public static void main(String[] args) {
		Set<Gugudan> s = new HashSet<>();
		
		s.add(new Gugudan(2, 3));
		s.add(new Gugudan(9, 9));
		s.add(new Gugudan(3, 2));
		
		for(Gugudan d : s) {
			System.out.println(d);
		}
	}
}
