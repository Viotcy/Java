package ch06hw;

import java.util.Scanner;

//��J�Ʀr�r��i��s�[

public class NumString {

	public static void main(String[] args) {
		Maxmin m = new Maxmin();
		Scanner s = new Scanner(System.in);
		int a = 0, i = 0, x = 0, d = 0;
		String w = "";
		double total = 0;

		
		System.out.println("�п�J�Ʀr,�����ɽп�Jquit");

		while (true) {
			w = s.next();

			if (w.indexOf("quit") == -1) {
				a = Integer.parseInt(w);

				i = m.getMax(a);
				x = m.getMin(a);
				d = m.getSum(a);
	

				total++;
				
			}else{
				break;
			}

		}
        
        
		System.out.println("�̤j��MAX = " + i);
		System.out.println("�̤p��MIN = " + x);
		System.out.println("�`�MSUM = " + d);
		System.out.println("������ = " + (d / total));

	}

}

class Maxmin {
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int sum =0;
	
	int getMax(int n) {
		
		if (n > max) {
			max = n;
		}

		return max;
	}

	int getMin(int n) {
		
		if (n < min) {
			min = n;
		}
		return min;
	}

	int getSum(int n) {		
		sum += n;
		return sum;
	}
}