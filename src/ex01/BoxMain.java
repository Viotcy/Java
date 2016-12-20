package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxMain {

	public static void main(String[] args) {
		Box b1=new Box('A',5,3,2);
		Box b2=new Box('B',4,3,2);
		Box b3=new Box('C',5,7,2);
		Box b4=new Box('D',5,3,3);
		
		List<Box> li= new ArrayList<Box>();
		li.add(b1);li.add(b2);
		li.add(b3);li.add(b4);
		Collections.sort(li);
		for(Box b:li){
			System.out.println(b);
		}

	}

}
