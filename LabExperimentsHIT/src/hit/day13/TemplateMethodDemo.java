package hit.day13;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		Sangeetha sangeethaHotel=new ShoiabSangeethaRestaurant();
		sangeethaHotel.process();
	}
}
abstract class Sangeetha{
	public final void uniform() {
		System.out.println("Uniform defined by Sangeetha..");
	}
	public final void serve() {
		System.out.println("Sangeetha defines how to serve..");
	}
	public abstract void makeIdly();
	
	public final void createIdlyPlate() {
		System.out.println("Sangeetha define how to create a idly plate..");
	}
	public final void charge() {
		System.out.println("Sangeetha define how much to charge..");
	}
	public final void process() {//Template method...
		uniform();
		makeIdly();
		createIdlyPlate();
		serve();
		charge();
	}
}
class ShoiabSangeethaRestaurant extends Sangeetha{

	public void makeIdly() {
		System.out.println("My grandma makes the idly in my hotel..");
	}	
}
