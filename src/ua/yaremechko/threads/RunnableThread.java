package ua.yaremechko.threads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RunnableThread implements Runnable {

	private int sleep;
	private Thread thread;

	public RunnableThread(int sleep) {
		super();
		this.sleep = sleep;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {

		System.out.println("Enter the number of Fibonacci numbers: ");
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();

		Integer[] fib = new Integer[numbers];

		fib[0] = 1;
		fib[1] = 1;

		for (int i = 0; i < numbers; i++) {

			if (i >= 2) {
				fib[i] = fib[0] + fib[1];
				fib[0] = fib[1];
				fib[1] = fib[i];
			}

		}
		fib[0] = 1;
		fib[1] = 1;

		Arrays.sort(fib, Collections.reverseOrder());

		for (int i = 0; i < numbers; i++) {

			System.out.print(fib[i] + " ");

			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();

	}

}
