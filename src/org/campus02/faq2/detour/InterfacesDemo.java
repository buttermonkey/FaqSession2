package org.campus02.faq2.detour;

import java.util.ArrayList;

public class InterfacesDemo {
	public static void main(String[] args) {
		ArrayList<Animal> zoo = new ArrayList<>();

		zoo.add(new Dog());
		zoo.add(new Cat());

		for (Animal animal : zoo) {
			animal.eat();
		}
	}
}
