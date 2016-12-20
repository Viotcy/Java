package recusive;

public class MainClass {

	public static void main(String[] args) {
		int[] i1 = {};
		int[] i2 = {100};
		int[] i3 = {25, 18, 100, 200, 300, 400, -15};
		System.out.println(Recursion01.sum(i1));
		System.out.println(Recursion01.sum(i2));
		System.out.println(Recursion01.sum(i3));
		
//		for (int n=0; n<= 10 ; n++) {
//		   System.out.println(Recursion01.factorial(n));
//		}
//		
//		for (int n=0; n<= 13 ; n++) {
//			   System.out.println(Recursion01.fibonacci(n));
//		}

	}

}
