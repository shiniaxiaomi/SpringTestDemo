package annotation.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStoppedEventTest extends ContextStoppedEvent {
    public ContextStoppedEventTest(ApplicationContext source) {
        super(source);
        System.out.println("Stopped");
    }
}
