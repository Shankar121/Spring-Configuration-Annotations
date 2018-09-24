package con.learning.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "may be its your lucky day";
	}

}
