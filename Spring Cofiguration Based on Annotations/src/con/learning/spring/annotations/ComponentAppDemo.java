package con.learning.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentAppDemo {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach coach=context.getBean("tennisCoach",Coach.class);
	System.out.println(coach.getMyDailyWorkout());
	System.out.println(coach.getDailyFortune());
	context.close();
}
}
