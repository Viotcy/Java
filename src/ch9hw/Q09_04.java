package ch9hw;

import java.util.ArrayList;
import java.util.Collections;

public class Q09_04 {

	public static void main(String[] args) {
		String[] name = { "�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����" };
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
