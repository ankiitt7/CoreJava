package FileHandling;

import java.io.File;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) {
		File f1=new File("e:\\");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(f1);
		System.out.println(f1.getName());
		String[] x=f1.list();
		for(String y:x)
		{
			System.out.println(y);
		}
	}

}
