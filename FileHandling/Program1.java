package FileHandling;

import java.io.File;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args)  {
		File f1=new File("e:\\test.txt");
			try {
				f1.createNewFile();
				System.out.println("File is created");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.getName());
			System.out.println(f1.getPath());
			System.out.println(f1.length()+"Bytes");
			f1.setWritable(false);
			f1.setWritable(true);
			
		System.out.println("Program ends");
	}
}
