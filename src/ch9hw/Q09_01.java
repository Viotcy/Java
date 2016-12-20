package ch9hw;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;


public class Q09_01 {
	public static void main(String[] args) {
          Collection<Object> v =new Vector<Object>(); 
          v.add(new Integer(100));
          v.add(new Double(3.14));
          v.add(new Long(24L));
          v.add(new Short((short)100));
          v.add(new Double(5.1));
          v.add("Kitty");
          v.add(new Integer(200));
          v.add(new Object());
          v.add("Snoopy");
          v.add(new BigInteger("1000"));
          
          for(Object ob : v){
        	  System.out.println(ob);
          }
          
          System.out.println("--------------------");
          
          Iterator<Object> it =v.iterator();
          
          while(it.hasNext()){
        	  Object o =it.next();
        	  if(!(o instanceof Number)){
        		 it.remove();
        	  }else{
        		  System.out.println(o);
        	  }
          }
          
	}
}
