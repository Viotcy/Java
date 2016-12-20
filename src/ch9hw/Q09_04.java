package ch9hw;

import java.util.ArrayList;
import java.util.Collections;

public class Q09_04 {

	public static void main(String[] args) {
		String[] name = { "±i§g¶®", "¼ï¬ü³·", "¼B³·²ú", "¶À±l±l", "¼ï¬ü³·", "¶À¬üµØ", "¼B³·ÄR", "¶À±l±l", "¼ï¬ü³·", "¼ï¬ü³·" };
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			a.add(name[i]);
		}
		Collections.sort(a);

		for (String d : a) {
			System.out.println(d);
		}
	}

}
