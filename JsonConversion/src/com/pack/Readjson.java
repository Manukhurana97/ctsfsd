package com.pack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Readjson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException  {
		
		ObjectMapper mapper  = new ObjectMapper();
		Student s = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(s);
		
		
		mapper.writeValue(new File("data.json"), s);
		
//		String data = mapper.writeValueAsString(s);
//		FileOutputStream fos = new FileOutputStream("data.json");
//		mapper.writeValue(fos, s);
		
		

	}

}
