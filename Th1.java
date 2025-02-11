class Demo extends Thread{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}
public class Th1 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Demo d = new Demo();
			d.start();
		}
	}
}
