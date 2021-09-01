package hit.day23;

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new ThreadJob(),"goldentouch");
		t.start();
	}
	public static void main(String[] args) {
		//How to capture the main thread
		//All java programs run in main thread by default.
		new ThreadRevision();
		Thread t=Thread.currentThread();
		System.out.println(t);
		//lazy for loop
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(i);
		}
	}
}
class ThreadJob implements Runnable{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("child thread is executed...."+t.getName());
	}
}
