package con.learning.spring.annotations;

public class SadFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return "It's your sad day";
	}
}
