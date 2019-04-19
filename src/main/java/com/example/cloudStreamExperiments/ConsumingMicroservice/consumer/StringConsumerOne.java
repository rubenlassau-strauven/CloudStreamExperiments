package com.example.cloudStreamExperiments.ConsumingMicroservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static com.example.cloudStreamExperiments.ConsumingMicroservice.binding.InputBindings.STRING_INPUT_PROCESSED_ONE;


@Component
public class StringConsumerOne {

  private static Logger logger = LoggerFactory.getLogger(StringConsumerOne.class);

  @StreamListener(STRING_INPUT_PROCESSED_ONE)
  public void consume(@Payload String data) {
    logger.info("String consumer one: {}", data);
  }
}
