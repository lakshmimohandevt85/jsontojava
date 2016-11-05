package com.java.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ToJava {

	public static void main(String[] args) 
	{
	ObjectMapper mapper = new ObjectMapper();
	try {
	//Student student1=	mapper.readValue("student.json", Student.class);
		Student student1 = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(student1.getMarks());
		
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
