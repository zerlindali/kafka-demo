package org.lic.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author ZerlindaLi create at 2020/10/30 16:24
 * @version 1.0.0
 * @description ConsumerListener
 */
@Component
public class ConsumerListener {
    @KafkaListener(topics="springboottopic", groupId = "springboottopic-group")
    public void onMessage(String msg){
        System.out.println("----收到消息："+msg+"----");
    }
}
