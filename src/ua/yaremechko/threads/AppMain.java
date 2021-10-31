package ua.yaremechko.threads;

public class AppMain {

	public static void main(String[] args) {

			
		MyThread myThread = new MyThread(1000);
		myThread.start();

		RunnableThread runnableThread = new RunnableThread(1000);
		
	}
}
