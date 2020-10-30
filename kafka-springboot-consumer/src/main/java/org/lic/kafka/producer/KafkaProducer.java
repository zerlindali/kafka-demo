package org.lic.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZerlindaLi create at 2020/10/30 16:29
 * @version 1.0.0
 * @description KafkaProducer
 */
@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public String send(@RequestParam String msg) {
        kafkaTemplate.send("springboottopic",msg);
        return "ok";
    }
}
