package con.learning.spring.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getMyDailyWorkout() {
		return "do swimming for an hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() +" Email: "+email+" Team: "+team;
	}

}
