package ch01.lab01;


public class HelloWorld {

	public static void main(String[] args) {
		String r = "kitty";
		String s = "kitty";
		System.out.println("(true)  r==s: " + (r==s));  // ºâ³N>Ãö«Y>ÅÞ¿è
		String t = new String("kitty");
		String u = new String("kitty");
		System.out.println("(false) t==u: " + (t==u));  		
		String a = t.intern();
		
		
//		Integer i1 = new Integer(100);
//		Long i2 = 100L;
//		
//		Double d1 = 3.14;
//		System.out.println(i1.getClass().getName());
//		double sum = i1 * i2 - d1 ;
//		System.out.println(sum);
//		
//		int[]  ia1 = {100, new Integer(100), 200};
//		Integer[]  ia2 = {100, 100, 300};
//
//		
//		
//		
//		

	}
    public static void m1(StringBuffer sb){
    	sb.append("12345");
    }
}
