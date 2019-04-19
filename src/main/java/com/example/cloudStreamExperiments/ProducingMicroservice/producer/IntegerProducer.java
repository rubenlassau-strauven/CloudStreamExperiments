package com.example.cloudStreamExperiments.ProducingMicroservice.producer;

import com.example.cloudStreamExperiments.ProducingMicroservice.binding.ProducerMicroServiceBindings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.springframework.integration.support.MessageBuilder.withPayload;

@Component
public class IntegerProducer {

  private ProducerMicroServiceBindings producerMicroServiceBindings;

  public IntegerProducer(ProducerMicroServiceBindings producerMicroServiceBindings) {
    this.producerMicroServiceBindings = producerMicroServiceBindings;
  }

  private static Logger logger = LoggerFactory.getLogger(IntegerProducer.class);

  public void produce(int data) {
    logger.info("Integer producer: {}", data);
    producerMicroServiceBindings.integerOutput().send(withPayload(data).build());
  }
}
