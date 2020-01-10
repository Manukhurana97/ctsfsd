package streamreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class copy {

	public static void main(String[] args) {
		
//		try {
//		FileInputStream in = new FileInputStream(new File("abc.txt"));
//		FileOutputStream out =  new FileOutputStream(new File("out.txt"));
//		
//		int b;
//		while((b = in.read())!=-1) {
//			out.write(b);
//			System.out.println(b);
//		}
////		in.close();
////		out.close();
//		}
//		catch(Exception e) {System.out.println(e);}
//	}
		
		
		
		try {
			BufferedReader r =  new BufferedReader(new FileReader("abc.txt"));
			BufferedWriter w =  new BufferedWriter(new FileWriter("out.txt"));
			

			String mgs = r.readLine();
			char[] data = new char[mgs.length()];
			
			for(int i=0;i<mgs.length();i++)
			{
				data[i] = (char) (mgs.charAt(i) *3);
				
			}
			w.write(data);
			r.close();
			w.close();
				
		}
		catch(Exception E) {}
	
		
	}
	

}
