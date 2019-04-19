package com.example.cloudStreamExperiments.ConsumingMicroservice.processor;

import com.example.cloudStreamExperiments.ConsumingMicroservice.binding.OutputBindings;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import static com.example.cloudStreamExperiments.ConsumingMicroservice.binding.InputBindings.STRING_INPUT;
import static org.springframework.integration.support.MessageBuilder.withPayload;

@Component
public class StringProcessor {

  private OutputBindings outputBindings;

  public StringProcessor(OutputBindings outputBindings) {
    this.outputBindings = outputBindings;
  }

  @StreamListener(STRING_INPUT)
  public void process(String data) {
    outputBindings.stringOutputProcessedOne().send(withPayload(data).build());
    outputBindings.stringOutputProcessedTwo().send(withPayload(data).build());
  }
}
