package Assignment;

public class ClassLockAssign {
public static void main(String[] args) {
	Sample obj1=new Sample();

	new Thread(new Runnable() {
		
		public void run() {
			obj1.met1();
			
		}
	}).start();
	
	Sample obj2=new Sample();
	new Thread(new Runnable() {
		public void run() {
			
		}
	}).start();
	}
	}
class Sample{
	int money=1000;
	public static void met1() {
		money=money+100;
		System.out.println();
	}
	
	public static void met2() {
		 		
	}
}
