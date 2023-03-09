package FileHandling;

import java.io.File;
import java.io.IOException;

public class Creation {
public static void main(String[] args) {
	
	File f1=new File("f://ankit.txt");
	
	try {
		f1.createNewFile();
		System.out.println("File Created...");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}
