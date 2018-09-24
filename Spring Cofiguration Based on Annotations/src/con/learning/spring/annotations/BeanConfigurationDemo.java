package con.learning.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
	Coach coach=context.getBean("swimCoach",Coach.class);
	System.out.println(coach.getDailyFortune());
}
}
