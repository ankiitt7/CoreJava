package FileHandling;

import java.io.File;
import java.io.IOException;

public class Program2 {
public static void main(String[] args) {
	
	File f=new File("e://hello.txt");
	
	try {
		f.createNewFile();
		System.out.println("File created........");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(f.canWrite());
	f.setWritable(false);

}
}
