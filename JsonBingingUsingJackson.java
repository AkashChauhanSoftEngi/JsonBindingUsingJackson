package com.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonBingingUsingJackson {
	public static void main(String[] args) {
		StudentModel student = new StudentModel();
		student.setFirstName("Ashutosh");
		student.setLastName("Rana");
		List<String> project = new ArrayList<>();
		project.add("One");
		project.add("Two");
		project.add("Three");
		student.setProject(project);
		
		/*From POJO to Json*/
		ObjectMapper mapper = new ObjectMapper();
		try {
			String studentString = mapper.writeValueAsString(student);
			System.out.println("json: " + studentString);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*From Json to POJO*/
		String json = "{\"firstName\":\"Ashutosh\",\"lastName\":\"Rana\",\"project\":[\"One\",\"Two\",\"Three\"]}";
		try {
			StudentModel studentModel = mapper.readValue(json, StudentModel.class);
			System.out.println(studentModel);
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
