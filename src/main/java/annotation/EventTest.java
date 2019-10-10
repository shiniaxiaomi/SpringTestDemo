package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */

@Component
public class EventTest extends ContextClosedEvent {
    public EventTest(ApplicationContext source) {
        super(source);
        System.out.println("23423423");
    }


}
