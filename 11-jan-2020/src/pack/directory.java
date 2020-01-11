package pack;

import java.io.File;

public class directory {
	public static void main(String[] args) {
		System.out.println("creating file name");
		String fname = "demo";
		File fn =  new File(fname);
		fn.mkdir();
		System.out.println("dir created");
		
		
//		creating a subdirectory
		
		File sub1 = new File(fn+"/demo1");
		sub1.mkdir();
		File sub2 = new File(fn+"/demo2");
		sub2.mkdir();
		System.out.println("Sub dierctory created");
		
		System.out.println();
		
		
		System.out.println(fname+fn.exists());
		fn.delete();
		System.out.println("deleted file");
	}

}
