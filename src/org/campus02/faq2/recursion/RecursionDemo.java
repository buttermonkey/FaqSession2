package org.campus02.faq2.recursion;

public class RecursionDemo {
	public static void main(String[] args) {
		int n = 10;
		int result = factorialOf(n);
		System.out.println(n + "! = " + result);

		// 0  1  1  2  3  5
		for (int i = 1; i <= n; i++) {
			System.out.print(fibonacciAt(i) + "  ");
		}
		System.out.println();
	}

	/**
	 * fib(1) = 0
	 * fib(2) = 1
	 * fib(pos) = fib(pos-2) + fib(pos-1)
	 */
	private static int fibonacciAt(int pos) {
		if (pos < 1) {
			System.out.println("ERROR: pos must be >= 1");
			return -1;
		}

		if (pos == 1) {
			return 0;
		}
		if (pos == 2) {
			return 1;
		}

		return fibonacciAt(pos - 2) + fibonacciAt(pos - 1);
	}

	/**
	 * 0! = 1
	 * n! = n * (n-1)!
	 */
	private static int factorialOf(int n) {
		if (n < 0) {
			System.out.println("ERROR: n must be >= 0");
			return -1;
		}

		if (n == 0) {
			return 1;
		}

		return n * factorialOf(n - 1);
	}
}
