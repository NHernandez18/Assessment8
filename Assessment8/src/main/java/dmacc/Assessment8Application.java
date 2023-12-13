package dmacc;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.CrabLegs;
import dmacc.beans.LobsterTail;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.LobsterTailRepository;

@SpringBootApplication
public class Assessment8Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment8Application.class, args);

		/*
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
				LobsterTail lt = appContext.getBean("LobsterTail", LobsterTail.class);
				System.out.println(lt.toString());
				*/
	}

	@Autowired
	LobsterTailRepository repo;
	
	public void run(String... args) throws Exception {
		
	// TODO Auto-generated method stub
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	//Using an existing bean
	LobsterTail lt = appContext.getBean("LobsterTail", LobsterTail.class);
	lt.setFlavor("Garlic, medium spicy");
	repo.save(lt);
	
	//Creating a bean to use – not managed by Spring
	LobsterTail d = new LobsterTail("1 lbs", 20.00, "Garlic, medium spicy");
	CrabLegs a = new CrabLegs(1, "Snow crab legs");
			d.setCrabLegs(a);
			repo.save(d);
			List<LobsterTail> allMySeafood = repo.findAll();
			
			for(LobsterTail food: allMySeafood) {
			System.out.println(food.toString());
			}
			((AbstractApplicationContext) appContext).close();
	
	}
}