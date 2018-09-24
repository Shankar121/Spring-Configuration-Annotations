package con.learning.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemo {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach coach=context.getBean("tennisCoach",Coach.class);
	System.out.println(coach.getDailyFortune());
	Coach thecoach=context.getBean("tennisCoach",Coach.class);
	System.out.println(thecoach.getDailyFortune());
}
}
