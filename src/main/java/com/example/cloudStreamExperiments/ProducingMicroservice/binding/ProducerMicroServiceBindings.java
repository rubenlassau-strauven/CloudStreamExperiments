package com.example.cloudStreamExperiments.ProducingMicroservice.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface ProducerMicroServiceBindings {

  String STRING_OUTPUT = "stringOutput";
  String INTEGER_OUTPUT = "integerOutput";

  @Output(STRING_OUTPUT)
  MessageChannel stringOutput();

  @Output(INTEGER_OUTPUT)
  MessageChannel integerOutput();
}
