package com.example.cloudStreamExperiments.ConsumingMicroservice.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface OutputBindings {

  String STRING_OUTPUT_PROCESSED_ONE = "stringOutputProcessedOne";
  String STRING_OUTPUT_PROCESSED_TWO = "stringOutputProcessedTwo";

  @Output(STRING_OUTPUT_PROCESSED_ONE)
  MessageChannel stringOutputProcessedOne();

  @Output(STRING_OUTPUT_PROCESSED_TWO)
  MessageChannel stringOutputProcessedTwo();
}
