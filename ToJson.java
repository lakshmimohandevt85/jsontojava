package com.java.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class ToJson {



	
	public static void main(String []args)
	
	{
		Student student = new Student();
		student.setMarks(100);
		student.setSid(152091);
		student.setName("Mohan Dev" );
		
		Address address = new Address();
		address.setAddress1("10775 Caminito Alvarez" );
		address.setAddress2("10775");
		address.setState("CA");
		address.setZipcode(92126);
		student.setAddress(address);
		//student.setAddress(address).toString;
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("student.json"), student);
			System.out.println("json file is created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
