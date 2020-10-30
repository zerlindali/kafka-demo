package org.lic.kafka.consumer;

import org.junit.jupiter.api.Test;
import org.lic.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaTests {

    @Autowired
    KafkaProducer controller;

    // 消费者：先启动KafkaApp
    @Test
    void contextLoads() {
         long time = System.currentTimeMillis();
         System.out.println("---"+time+", 已经发出----");
         controller.send("李程最棒, "+time);
    }

}
