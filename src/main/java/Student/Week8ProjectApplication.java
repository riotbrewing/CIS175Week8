package Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import Student.beans.PersonalDetails;
import Student.controller.BeanConfig;
import Student.repository.StudentRepository;

@SpringBootApplication
public class Week8ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(Week8ProjectApplication.class, args);
		
		
	}
	@Autowired
	StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		PersonalDetails input_one = appContext.getBean("details", PersonalDetails.class);
		repo.save(input_one);
		
		PersonalDetails input_two = new PersonalDetails(90012345 ,"Peter Testerberg" , 3.5);
		repo.save(input_two);
		
		PersonalDetails input_three = new PersonalDetails(90054321 ,"Vincent Testaverdi" , 2.75);
		repo.save(input_three);
		
		PersonalDetails input_four = new PersonalDetails(90099999 ,"Colm McTest" , 2.92);
		repo.save(input_four);
		
		List<PersonalDetails> allDetails = repo.findAll();
		
		for(PersonalDetails i: allDetails)
		{
			System.out.println(i.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
