package con.learning.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
    
	FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside default constructor");
	}
	
	@Autowired
	public void setFortuneService(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getMyDailyWorkout() {
		return "do tennis practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() +" hascode: "+hashCode();
	}
	
	@PostConstruct
	public void doInit() {
		System.out.println("Intialized: doInit - TennisCoach");
	}
	@PreDestroy
	public void doDestroy() {
		System.out.println("Destroyed: doDestroy - TennisCoach");
	}

}
