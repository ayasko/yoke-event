package com.epam.yoke.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.epam.yoke.event.configuration.NotifierBinding;
import com.epam.yoke.event.model.rq.NotifyEventBody;

@Component
@EnableBinding(NotifierBinding.class)
public class StreamService {
		
	@Autowired
	private NotifierBinding notifierBinding;

	public void createEvent(NotifyEventBody event) {
		notifierBinding.createEvent().send(MessageBuilder.withPayload(event).build()); 
	} 	
	
	public void deleteEvent(String eventId) {
		notifierBinding.deleteEvent().send(MessageBuilder.withPayload(eventId).build());
	}
}