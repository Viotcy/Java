package ch9hw;

import java.util.ArrayList;
import java.util.Collections;


public class Q09_03 {

		public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(new Double(98));
		a.add(new Double(12.345));
		a.add(new Double(97.85));
		a.add(new Double(12));
		Collections.sort(a);
		
		for (Double d : a) {
			System.out.println(d);
		}
	}

}
