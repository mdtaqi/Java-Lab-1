package hit.revision.day2;

import java.util.Scanner;

public class LoopingDemo {
	public static void main(String[] args) {
		
		/*while- pre condition loop
		do-while- post condition loop
		*/
	boolean b=false;
	
	while(b) { // pre condition check sees th3 value of b as false
		System.out.println("While loop called...");
	}
	do {
		System.out.println("do while loop called...");
		}while(b); //post condition check sees the value of b as false, so it terminates the loop
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a value.. less thaan 10..");
		int x=scan.nextInt();
		
		//while loop will work with a declaration and initialization and then a condition
		//and increment and decrement
		
		while(x<10) {
			System.out.println("x value is...."+x);
			x++;
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		do {
			System.out.println("for loop called...."+x);
			x--;
		}while(x>0);
		
		for(int i=0;i<10;++i) {
			System.out.println("for loop called..."+i);
		}
		for(int i=0,j=10;i<10 && j>0;i++,j--) {
			System.out.println(i+":"+j);
		}
		
		//nested for loop - the loops get 25 times executed
		for(int i=0;i<5;i++) {// runs 5times
			for(int j=0;j<5;j++) { ///each time the outloop runs, this inner loop runs 5 times
				
				System.out.println(j+"\t");
			}
			System.out.println();
		}
	}
	
}
