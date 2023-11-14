package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class HelloSpringApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");

		if(context != null) {
			// retrieve bean from spring container
			Coach theCricketCoach = (CricketCoach) context.getBean("myCricketCoach", Coach.class);


			// call methods on the bean
			System.out.println(theCricketCoach.getDailyWorkout());
			System.out.println(theCricketCoach.getInformation());
			System.out.println(theCricketCoach.getDailyFortune());
			System.out.println(((CricketCoach)(theCricketCoach)).getEmail());
			System.out.println(((CricketCoach)(theCricketCoach)).getTeam());

			// retrieve bean from spring container
			Coach theBaseballCoach = (BaseballCoach) context.getBean("myBaseBallCoach", Coach.class);


			// call methods on the bean
			System.out.println(theBaseballCoach.getDailyWorkout());
			System.out.println(theBaseballCoach.getInformation());

			// let's call our new method for fortunes
			System.out.println(theBaseballCoach.getDailyFortune());



			// close the context
		}
		else {
			context.close();
			throw new FileNotFoundException("Application Context File not Found !!!");

		}
	}

}
