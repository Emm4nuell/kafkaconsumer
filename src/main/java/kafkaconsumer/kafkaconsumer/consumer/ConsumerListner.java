package kafkaconsumer.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListner {

    @KafkaListener(topics = "topic-1", groupId = "group-1")
    public void msg(String msg){
        System.err.println("Recebido do producer: " + msg);
    }
}
