package ch9hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q09_05 {

	public static void main(String[] args) {
		BoyFriend bf1 = new BoyFriend("·Å¤p±l", 50000, 168);
		BoyFriend bf2 = new BoyFriend("¼B¥®³Ç", 65000, 170);
		BoyFriend bf3 = new BoyFriend("¤ý¤¦¤¦", 75000, 160);
		BoyFriend bf4 = new BoyFriend("©P¬P¬P", 50000, 165);
		BoyFriend bf5 = new BoyFriend("»¯ªì©ú", 50000, 170);
		List<BoyFriend> c = new ArrayList<BoyFriend>();
		c.add(bf1);
		c.add(bf2);
		c.add(bf3);
		c.add(bf4);
		c.add(bf5);
		Collections.sort(c);
		for (BoyFriend bf : c) {
			System.out.println(bf);
		}

	}

}
