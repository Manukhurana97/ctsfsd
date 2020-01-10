package streamreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy {

	public static void main(String[] args) {
		
		try {
		FileInputStream in = new FileInputStream(new File("abc.txt"));
		FileOutputStream out =  new FileOutputStream(new File("out.txt"));
		
		int b;
		while((b = in.read())!=-1) {
			out.write(b);
			System.out.println(b);
		}
		in.close();
		out.close();
		}
		catch(Exception e) {System.out.println(e);}
	}

}
