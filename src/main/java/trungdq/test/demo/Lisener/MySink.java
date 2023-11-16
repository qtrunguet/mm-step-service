package trungdq.test.demo.Lisener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
    String INPUT = "myInput";

    @Input(INPUT)
    SubscribableChannel input();
}