package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */


@Configuration
@ComponentScan("annotation")
public class ConfigurationTest {

    @Autowired
    Cat cat;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationTest.class);
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);

        Cat cat2 = (Cat) context.getBean("cat2");
        System.out.println(cat2);
    }
}
