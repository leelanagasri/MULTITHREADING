class Demo2 implements Runnable {
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}
public class Th2 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Thread ob = new Thread(new Demo2());
			ob.start();
		}
	}
}
