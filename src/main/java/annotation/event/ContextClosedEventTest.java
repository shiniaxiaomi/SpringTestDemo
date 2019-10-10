package annotation.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedEventTest extends ContextClosedEvent {
    public ContextClosedEventTest(ApplicationContext source) {
        super(source);
        System.out.println("Closed");
    }
}
