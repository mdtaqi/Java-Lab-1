package hit.day36;

public class PesimisticLockDemo {
	public static void main(String[] args) {
		InterviewHall interview=new InterviewHall();
		InterviewHall interview2=new InterviewHall();
		
		new Thread(()->{
			synchronized(InterviewHall.class) {
				InterviewHall.interviewer1();
				InterviewHall.interviewer2();
				InterviewHall.interviewer3();
				InterviewHall.interviewer1();
				InterviewHall.interviewer3();
			}
		},"ramu").start();
		
		new Thread(()->{
			synchronized(InterviewHall.class) {
				InterviewHall.interviewer1();
				InterviewHall.interviewer2();
				InterviewHall.interviewer3();
				InterviewHall.interviewer1();
				InterviewHall.interviewer3();
			}
		},"somu").start();
	}
}
class InterviewHall{
	public static void interviewer1() {
		System.out.println("first question asked.....to...:"+Thread.currentThread().getName());
	}
	
	public static void interviewer2() {
		System.out.println("second question asked....to...:"+Thread.currentThread().getName());
	}
	public static void interviewer3() {
		System.out.println("third question asked....to...:"+Thread.currentThread().getName());
	}
	
}
