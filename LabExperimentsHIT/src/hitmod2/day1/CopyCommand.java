package hitmod2.day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyCommand {
	//This program opens a file connection and closes it automatically
	public static void main(String[] args) throws Exception {
		
		try(
				FileInputStream fis=new FileInputStream("temp.txt");
				FileOutputStream fos=new FileOutputStream("copytemp.txt");
				){
				int i=0;
				
				while((i=fis.read())!=-1) {
					System.out.print((char)i);
					fos.write(i);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
				
	}
