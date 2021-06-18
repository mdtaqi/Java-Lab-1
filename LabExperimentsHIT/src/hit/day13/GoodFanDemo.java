package hit.day13;
import java.util.Scanner;

public class GoodFanDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		GoodFan khaitan=new GoodFan();
		while(true) {
			System.out.println("Press a key and then Enter for pulling chain..");
			scan.next();
			khaitan.pull();
		}
	}
}

/*it is written here for my reference
 * Paint brush followed uni directional relationship
 * Fan will follow bi-directional relationship
 */

class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}

abstract class State{
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State{				// condition class grouped under a category .//
	public void pull(GoodFan fan) 
	{
		System.out.println("Switch on state....");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	
	
	public void pull(GoodFan fan) {
		System.out.println("medium speed state.............");
		fan.state=new MediumSpeedState();
	}
}

class MediumSpeedState extends State{
	
	public void pull(GoodFan fan) 
	{
		System.out.println("high speed state...........");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	
	public void pull(GoodFan fan) {
		System.out.println("switch off state....");
		fan.state=new SwitchOffState();
	}
}

class BadFan{
	int state;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
			state=1;
		}
		else if(state==1) {
			System.out.println("Medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("High speed state...");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state...");
			state=0;
		}	
	}
}
