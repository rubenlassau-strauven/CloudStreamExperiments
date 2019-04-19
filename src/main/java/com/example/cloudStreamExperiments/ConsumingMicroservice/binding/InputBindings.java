package com.example.cloudStreamExperiments.ConsumingMicroservice.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputBindings {

  String STRING_INPUT = "stringInput";
  String STRING_INPUT_PROCESSED_ONE = "stringInputProcessedOne";
  String STRING_INPUT_PROCESSED_TWO = "stringInputProcessedTwo";
  String INTEGER_INPUT = "integerInput";

  @Input(STRING_INPUT)
  SubscribableChannel stringInput();

  @Input(STRING_INPUT_PROCESSED_ONE)
  SubscribableChannel stringInputProcessedOne();

  @Input(STRING_INPUT_PROCESSED_TWO)
  SubscribableChannel stringInputProcessedTwo();

  @Input(INTEGER_INPUT)
  SubscribableChannel integerInput();
}
