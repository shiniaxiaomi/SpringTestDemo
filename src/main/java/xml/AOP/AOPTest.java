package xml.AOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/10/10.
 */
public class AOPTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/springAOP.xml");
        context.getBean(Person.class).hello("hello");//获取对象并调用对应的方法
    }
}
