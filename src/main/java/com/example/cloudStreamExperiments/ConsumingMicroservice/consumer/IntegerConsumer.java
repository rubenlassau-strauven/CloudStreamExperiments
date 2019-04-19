package com.example.cloudStreamExperiments.ConsumingMicroservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static com.example.cloudStreamExperiments.ConsumingMicroservice.binding.InputBindings.INTEGER_INPUT;

@Component
public class IntegerConsumer {

  private static Logger logger = LoggerFactory.getLogger(IntegerConsumer.class);

  @StreamListener(INTEGER_INPUT)
  public void consume(@Payload int data) {
    logger.info("Integer consumer: {}", data);
  }
}
