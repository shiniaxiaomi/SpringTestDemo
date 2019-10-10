package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation/spring.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);
    }
}
