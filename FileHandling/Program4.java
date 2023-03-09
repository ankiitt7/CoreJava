package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw1=new FileWriter("e:\\java.txt");
			fw1.write("Today is a Christmas day Eve. Everybody "
					+ "is enjoying but as I being "
					+ "a very sincere Student so "
					+ "I am learning java" );
			fw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
