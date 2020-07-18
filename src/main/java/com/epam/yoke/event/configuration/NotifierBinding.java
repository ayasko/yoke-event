package com.epam.yoke.event.configuration;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface NotifierBinding {

	String OUTPUT_CREATE_EVENT = "createEvent";
	String OUTPUT_DELETE_EVENT = "deleteEvent";
    
    @Output(OUTPUT_CREATE_EVENT)
    MessageChannel createEvent();
    
    @Output(OUTPUT_DELETE_EVENT)
    MessageChannel deleteEvent();
}