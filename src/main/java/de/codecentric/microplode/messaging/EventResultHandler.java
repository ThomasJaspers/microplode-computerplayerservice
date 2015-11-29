package de.codecentric.microplode.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import de.codecentric.microplode.configuration.MessagingConfiguration;
import de.codecentric.microplode.messaging.api.Event;

@Component
public class EventResultHandler {

    @RabbitListener(queues=MessagingConfiguration.queueNameComputerPlayer)
    public void handleMessage(@Payload Event event) {
        System.out.println("Event received");
        System.out.println("EventType: " + event.getType().getText());
    }
}
