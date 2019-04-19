package com.example.cloudStreamExperiments.ConsumingMicroservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static com.example.cloudStreamExperiments.ConsumingMicroservice.binding.InputBindings.STRING_INPUT_PROCESSED_TWO;

@Component
public class StringConsumerTwo {

  private static Logger logger = LoggerFactory.getLogger(StringConsumerTwo.class);

  private int retries = 0;

  @StreamListener(STRING_INPUT_PROCESSED_TWO)
  public void consume(@Payload String data) throws Exception {
    logger.info("String consumer two: attempt {} ...", retries);

    retries++;
    if (retries < 3) throw new Exception("Consumer two failed, retrying...");

    logger.info("String consumer two: {}", data);
  }
}
