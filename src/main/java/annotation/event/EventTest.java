package annotation.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */

@Component
@ComponentScan("annotation.event")
public class EventTest{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventTest.class);
    }
}
