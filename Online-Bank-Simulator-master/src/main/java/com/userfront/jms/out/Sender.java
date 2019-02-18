package com.userfront.jms.out;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class Sender {

	  private static final Logger LOGGER =
	      LoggerFactory.getLogger(Sender.class);
	  
	  public static final String QUEUE_NAME = "mhjqueue.q";

	  @Autowired
	  private JmsTemplate jmsTemplate;

	  public void send(String object) {
	    LOGGER.info("sending message='{}'", object);
	    jmsTemplate.convertAndSend(QUEUE_NAME, object);
	  }
	}