package hit.revision.day2;

public class BreakandContinue {
	public static void main(String[] args) {
		for(int i=1;i<0;i++) {
			if(i%2==0) {
				//continue; //continue continues the loop ans not the below statements
				
				break; // break will break the loop
			}
			
			System.out.println(i);
		}// break will come out here from line 8 - statements in between will be ignored
		boolean b=true;
		a:{
		System.out.println("a block...");
			b:{
				System.out.println("b block");
				c:{
					if(b) {break a;}
					System.out.println("c block..");
					d:{
						System.out.println("d block..");
						
					}
				}
			}
		}
	}
}
