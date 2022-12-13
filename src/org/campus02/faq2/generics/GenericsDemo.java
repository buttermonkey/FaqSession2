package org.campus02.faq2.generics;

public class GenericsDemo {
	public static void main(String[] args) {
		BorderFormatter<String> stringBorderFormatter = new BorderFormatter<>();
		BorderFormatter<Integer> integerBorderFormatter = new BorderFormatter<>();
		BorderFormatter<Boolean> booleanBorderFormatter = new BorderFormatter<>();
		String greeting = "Hello world!";
		int answerToEverything = 42;

 		System.out.println(stringBorderFormatter.format(greeting));
		System.out.println();
		System.out.println(integerBorderFormatter.format(answerToEverything));
		System.out.println();
		System.out.println(booleanBorderFormatter.format(false));
	}
}
