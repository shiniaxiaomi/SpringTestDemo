package annotation.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/10/10.
 */

@Component
public class ContextRefreshedEventTest extends ContextRefreshedEvent {
    public ContextRefreshedEventTest(ApplicationContext source) {
        super(source);
        System.out.println("Refreshed");
    }
}
