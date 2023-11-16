import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import trungdq.test.demo.Producer.MySource;

@EnableBinding(MySource.class)
public class KafkaProducer {

    @Autowired
    private MySource mySource;

    public void sendMessage(String message) {
        mySource.output().send(MessageBuilder.withPayload(message).build());
    }
}