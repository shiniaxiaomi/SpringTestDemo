package annotation.AOP;


import annotation.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //使用注解开启AOP(该类需要被IOC管理才能生效,所以需要加上@Configuration或者@Component)
@ComponentScan("annotation.AOP")
public class AOPTest {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPTest.class);
//        context.getBean(Person.class).hello("hello-annotation");//获取对象并调用对象被切面的方法(该对象必须是被IOC容器管理的)
        context.getBean(Person.class).study("book",new Cat());

    }

}
