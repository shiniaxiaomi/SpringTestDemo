package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */

@Component
@PropertySource("classpath:annotation/app.properties")
public class AppConfig {
    @Value("${catalog.name}")
    String name;
    @Value("1")
    int age;

    //在bean创建后调用
    @PostConstruct
    public void create(){
        System.out.println("创建");
    }

    //在bean销毁前调用
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation/spring.xml");
        AppConfig appconfig = (AppConfig) context.getBean("appConfig");
        System.out.println(appconfig.name);
        System.out.println(appconfig.age);
        context.close();//结束
    }
}