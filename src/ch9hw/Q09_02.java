package ch9hw;

import java.util.*;

public class Q09_02 {

	public static void main(String[] args) {
		String[] name = { "±i§g¶®", "¼ï¬ü³·", "¼B³·²ú", "¶À±l±l", "¼ï¬ü³·", "¶À¬üµØ", "¼B³·ÄR", "¶À±l±l", "¼ï¬ü³·", "¼ï¬ü³·" };
		Set<String> s = new TreeSet<String>();
		for (int i = 0; i < name.length; i++) {
			s.add(name[i]);
		}
		for (String s1 : s) {
			System.out.println(s1);
		}
	}

}
