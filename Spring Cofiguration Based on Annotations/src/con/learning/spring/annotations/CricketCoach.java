package con.learning.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach{
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
//	@Autowired
//	public CricketCoach(FortuneService fortuneService) {
//		this.fortuneService=fortuneService;
//	}
	@Override
	public String getMyDailyWorkout() {
		return "practice cricket 1 hr daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
