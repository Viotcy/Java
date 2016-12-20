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
	    
	    System.out.print(String.valueOf(d1)+"�[" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());  
	    
	    bd3 = bd1.subtract(bd2);
	    System.out.print(String.valueOf(d1)+"��" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());  
	    
	    bd3 = bd1.multiply(bd2);
	    System.out.print(String.valueOf(d1)+"��" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());
	    // 	divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	    //  divide() ���T�ӰѼ�
	    //  1. BigDecimal divisor: ����, 
	    //  2. int scale: �p���I�᪺���, scale�O���y�ءB�����W�蹺�����סz�A�o���׭n�h��? 
	    //     �C0.1�@��? (scale��1)�F�C0.01�@��? (scale��2)�F�̦�����
	    //  3. RoundingMode roundingMode:  �h���h�l�Ʀr���Ҧ�
	    bd3 = bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);
	    System.out.print(String.valueOf(d1)+"��" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());
	    BigInteger bi = new BigInteger("10000");
	    BigDecimal bd5 = new BigDecimal(bi, 2);
	    System.out.println(bd5);
	    
	}
}
