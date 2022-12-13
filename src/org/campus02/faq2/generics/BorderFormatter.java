package org.campus02.faq2.generics;

public class BorderFormatter<T> {
	public String format(T output) {
		String text = output.toString();
		return    "+-" + "-".repeat(text.length()) + "-+\n"
				+ "| " + text + " |\n"
				+ "+-" + "-".repeat(text.length()) + "-+";
	}
}
