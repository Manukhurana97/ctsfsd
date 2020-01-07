package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strtest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter string");
		String data = br.readLine();
		strtochar stc = new strtochar();
		stc.createchar(data);
		stc.display();
	}

}
