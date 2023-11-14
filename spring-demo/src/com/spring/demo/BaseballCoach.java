package com.spring.demo;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency
		private FortuneService fortuneService;
		
		// define a constructor for dependency injection
		public BaseballCoach() {
					
		}
		// define a constructor for dependency injection
		public BaseballCoach(FortuneService theFortuneService) {
			System.out.println("Constructor -- Injection called ...");
			fortuneService = theFortuneService;
		}
		
		@Override
		public String getDailyWorkout() {
			return "Spend 30 minutes on batting practice";
		}

	@Override
	public String getInformation() {
		return "Hello Baseball Coach";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getDailyFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter -- Injection called ...");
		this.fortuneService = fortuneService;
	}

}
