
public class ThreadingExample extends Thread{
	
	public void run () {
		System.out.println("Thread is running");
	}
	
	public static void main (String args[]) throws InterruptedException{
		ThreadingExample myFirstThread = new ThreadingExample();
		myFirstThread.start();		
		Thread.sleep(5000);
		System.out.print("continue");
	}
}
