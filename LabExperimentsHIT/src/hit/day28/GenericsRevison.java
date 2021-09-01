package hit.day28;

public class GenericsRevison {
	public static void main(String[] args) {
		Child3<Ball> child3=new Child3<>();
		child3.setObj(new Ball());
		child3.getObj().play();
		
		Child3<Sweet> child33=new Child3<>();
		child33.setObj(new Sweet());
		child33.getObj().eat();
	}
}
class Ball{
	public void play() {
		System.out.println("Playing with the ball..");
	}
}
class Sweet{
	public void eat() {
		System.out.println("Eating the sweet..");
	}
}
//1. Approach 1
// One way of creating association between child and the items is

class Child{
	Ball ball;
	public void action() {
		ball.play();
	}
}
// The problem with the above association is, the child is tightly coupled with ball
//2. Approach 2

class Child2{
	Object obj;
	public void action() {
		if(obj instanceof Ball) {
			Ball ball=(Ball)obj;
			ball.play();
		}
		else if(obj instanceof Sweet) {
			Sweet sweet=(Sweet)obj;
			sweet.eat();
		}
	}
}

//the problem with the above approach is, though this accept object which looks like loosely coupled
//but the if-else-if ladder makes it tightly coupled...
//the code is open for modification - which is a bad code...
//3. Approach 3  - Generics Approach

class Child3<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return this.obj;
	}

}
