package ch10hw;

import java.io.Serializable;

public class Dog implements Serializable,Mammal{
	String name;

	public Dog(String name) {
		this.name = name;
	}
	public void smile(){
		System.out.println("Dog =>" +name+":)");
	}
	public void bark(){
		System.out.println("Dog =>" +name+"wannwann");
	}
}
