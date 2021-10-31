package ua.yaremechko.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThread extends Thread {

	private int sleep;

	public MyThread(int sleep) {
		super();
		this.sleep = sleep;
	}

	@Override
	public void run() {

		System.out.println("Enter the number of Fibonacci numbers: ");
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();

		int[] fib = new int[numbers];

		fib[0] = 1;
		fib[1] = 1;

		for (int i = 0; i < numbers; i++) {

			if (i < 2) {
				System.out.print(fib[i] + " ");
			}
			if (i >= 2) {
				fib[i] = fib[0] + fib[1];
				System.out.print(fib[i] + " ");
				fib[0] = fib[1];
				fib[1] = fib[i];
			}
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println();

	}

}
