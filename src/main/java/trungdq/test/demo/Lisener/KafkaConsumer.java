package trungdq.test.demo.Lisener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MySink.class)
public class KafkaConsumer {

    @StreamListener(MySink.INPUT)
    public void handle(String message) {
        System.out.println("Received message: " + message);
    }
}
