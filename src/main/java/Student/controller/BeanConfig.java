package Student.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Student.beans.PersonalDetails;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 7, 2023
 */

@Configuration
public class BeanConfig {
	
	@Bean
	public PersonalDetails details()
	{
		PersonalDetails bean = new PersonalDetails();
		bean.setStudent_name("Timmy DeTester");
		bean.setStudent_gpa(3.85);
		bean.setStudent_id(900046858);
		
		return bean;
	}
}
