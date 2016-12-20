package ch07hw;

public class Q07_01 {
    
	static{
         System.out.println('A');		
	}
	
	Q07_01(){};
	
	static{
		System.out.println('B');	
	}
	public static void main(String[] args) {
		Q07_01 con =new Q07_01();
		System.out.println("HaHaHa");
	}
	static{
		System.out.println('C');
	}

}
