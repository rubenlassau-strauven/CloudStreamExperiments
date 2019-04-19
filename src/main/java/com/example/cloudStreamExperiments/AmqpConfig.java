package com.example.cloudStreamExperiments;

import com.example.cloudStreamExperiments.ConsumingMicroservice.binding.InputBindings;
import com.example.cloudStreamExperiments.ConsumingMicroservice.binding.OutputBindings;
import com.example.cloudStreamExperiments.ProducingMicroservice.binding.ProducerMicroServiceBindings;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({ProducerMicroServiceBindings.class, InputBindings.class, OutputBindings.class})
public class AmqpConfig {}
