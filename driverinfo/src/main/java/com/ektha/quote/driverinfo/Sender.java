/**
 * 
 */
package com.ektha.quote.driverinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.ektha.quote.driverinfo.model.Driver;

/**
 * @author AsimSubedi
 *
 */
@Service
public class Sender {

	private static final Logger logger = LoggerFactory.getLogger(Sender.class);
	
	@Autowired
	private KafkaTemplate<Driver, String> kafkaTemplate;
	
	@Value("${app.topic.foo}")
	private String topic;
	
	public void send(Driver driverMessage) {
		logger.info("SENDING MESSAGE ='{}' to topic = '{}'", driverMessage, topic);
		
		Message<Driver> builtMessage = MessageBuilder
				.withPayload(driverMessage)
				.setHeader(KafkaHeaders.TOPIC, topic)
				.build();
		
		kafkaTemplate.send(builtMessage);
	}
	
}
