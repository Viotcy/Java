package ch07hw;

abstract class Human {
	int weight = 50;

	abstract void smile();

}

abstract class OrdinaryPeople extends Human {

}

class HappyMary extends OrdinaryPeople {

	@Override
	void smile() {
		System.out.println("HA");

	}

}

public class Q07_03 {

	public static void main(String[] args) {
		HappyMary hm = new HappyMary();
		hm.smile();

	}

}
