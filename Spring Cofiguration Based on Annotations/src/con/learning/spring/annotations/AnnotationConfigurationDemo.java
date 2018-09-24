package con.learning.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigurationDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
	Coach coach=context.getBean("tennisCoach",Coach.class);
	System.out.println(coach.getDailyFortune());
}
}
