package hit.day24;

public class TwoMethOneTask {
	public static void main(String[] args) {
		Canon1 bofors=new Canon1();
		ShootingTask1 st=new ShootingTask1(bofors);
		
		Thread wael=new Thread(st,"wael");
		Thread Aslam=new Thread(st,"aslam");
		
		wael.start();
		Aslam.start();
	}
}
class ShootingTask1 implements Runnable{
	Canon1 gun;
	public ShootingTask1(Canon1 gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("wael")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
		else if(t.getName().equals("aslam")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
	}
}
class Canon1{
	boolean flag;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println(name+" fills the gun...");
		flag=true;
		notify();
	}
	
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println(name+" shoot the gun...");
		flag=false;
		notify();
	}
	}

