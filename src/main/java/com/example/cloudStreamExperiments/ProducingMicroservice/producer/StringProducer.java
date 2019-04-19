package com.example.cloudStreamExperiments.ProducingMicroservice.producer;

import com.example.cloudStreamExperiments.ProducingMicroservice.binding.ProducerMicroServiceBindings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.springframework.integration.support.MessageBuilder.withPayload;

@Component
public class StringProducer {

  private static Logger logger = LoggerFactory.getLogger(StringProducer.class);

  private ProducerMicroServiceBindings producerMicroServiceBindings;

  public StringProducer(ProducerMicroServiceBindings producerMicroServiceBindings) {
    this.producerMicroServiceBindings = producerMicroServiceBindings;
  }

  public void produce(String data) {
    logger.info("String producer: {}", data);
    producerMicroServiceBindings.stringOutput().send(withPayload(data).build());
  }
}
