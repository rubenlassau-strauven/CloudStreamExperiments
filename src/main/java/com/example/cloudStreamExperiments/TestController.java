package com.example.cloudStreamExperiments;

import com.example.cloudStreamExperiments.ProducingMicroservice.producer.StringProducer;
import com.example.cloudStreamExperiments.ProducingMicroservice.producer.IntegerProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private StringProducer stringProducer;
  private IntegerProducer integerProducer;

  public TestController(StringProducer stringProducer, IntegerProducer integerProducer) {
    this.stringProducer = stringProducer;
    this.integerProducer = integerProducer;
  }

  @GetMapping("/produce")
  public String testProducer() {
    stringProducer.produce("Test data!");
    integerProducer.produce(123);
    return "done";
  }
}
