package ex01;


import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo01 {

	public static void main(String[] args) {
		Collection<Number>  coll01 =
				new LinkedList<>();
		coll01.add(123);
		coll01.add(6.28);
		coll01.add(1000000000000L);
		coll01.add(new BigInteger("100"));
		
		Collection<Number>  coll02 =  
				new LinkedList<>();
		
		Collection<Integer>  coll03 =  
				new LinkedList<>();
		
		Collection<Double>  coll031 =  
				new LinkedList<>(); 

		Collection<Long>  coll032 =  
				new LinkedList<>(); 
		
		
		
		coll01.addAll(coll02);
		coll01.addAll(coll03);
		coll01.addAll(coll031);
		coll01.addAll(coll032);
	
		
		Iterator<Number> it = coll01.iterator();
		
		while (it.hasNext()){
		  Number num = it.next();
		  System.out.println(num);
		  if (num.doubleValue() < 120){
			  it.remove();
		  }
		}
		System.out.println("------------------");
		 it = coll01.iterator();
			
			while (it.hasNext()){
			  System.out.println(it.next());
			 
			}
		
				
		
//		boolean   addAll(Collection<? extends E> c)	


	}

}
