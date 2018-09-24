package con.learning.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneSevice implements FortuneService {

	@Override
	public String getFortune() {
		return "It's your lucky day";
	}

}
