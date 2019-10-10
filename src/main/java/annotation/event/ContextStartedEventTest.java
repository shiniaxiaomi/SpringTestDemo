package annotation.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartedEventTest extends ContextStartedEvent {

    public ContextStartedEventTest(ApplicationContext source) {
        super(source);
        System.out.println("Started");
    }
}
