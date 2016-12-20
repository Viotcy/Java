package ch01.lab01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalDemo {
	public static void main(String[] args) {
		double d1 = 143.425;
		double d2 = 2.3875;
	    System.out.println(d1+d2);
	    
	    BigDecimal bd1 = new BigDecimal(d1);
	    BigDecimal bd2 = new BigDecimal(d2);
	    BigDecimal bd3 = bd1.add(bd2);
	    System.out.println(bd3.toString());  // NG
	    bd1 = new BigDecimal(String.valueOf(d1));  // 3.14
	    bd2 = new BigDecimal(String.valueOf(d2));
	    bd3 = bd1.add(bd2);
	    
	    System.out.print(String.valueOf(d1)+"" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());  
	    
	    bd3 = bd1.subtract(bd2);
	    System.out.print(String.valueOf(d1)+"搭" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());  
	    
	    bd3 = bd1.multiply(bd2);
	    System.out.print(String.valueOf(d1)+"" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());
	    // 	divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	    //  divide() 把计
	    //  1. BigDecimal divisor: 埃计, 
	    //  2. int scale: 计翴计, scale琌へ单ㄨ购だ硂だ璶灿? 
	    //     –0.1? (scale1)–0.01? (scale2)ㄌ摸崩
	    //  3. RoundingMode roundingMode:  埃緇计家Α
	    bd3 = bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);
	    System.out.print(String.valueOf(d1)+"埃" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());
	    BigInteger bi = new BigInteger("10000");
	    BigDecimal bd5 = new BigDecimal(bi, 2);
	    System.out.println(bd5);
	    
	}
}
