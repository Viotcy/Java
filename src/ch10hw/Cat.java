package ch10hw;

import java.io.Serializable;

public class Cat implements Serializable,Mammal{
	String name;

	public Cat(String name) {
		this.name = name;
	}
	public void smile(){
		System.out.println("Cat =>" +name+":)");
	}
	public void bark(){
		System.out.println("Cat =>" +name+"meaomeao");
	}
}
