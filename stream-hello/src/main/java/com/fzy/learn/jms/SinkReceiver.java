package com.fzy.learn.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@EnableBinding用来指定一个或多个定义了@Input或@Output注解的接口，以此实现对消息通道（Channel）的绑定
//Sink接口是Spring Cloud Stream中默认实现的对输入消息通道绑定的定义
@EnableBinding(Sink.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);


    //通过@Input注解绑定了一个名为input的通道。
    // 除了Sink之外，Spring Cloud Stream还默认实现了绑定output通道的Source接口，
    // 还有结合了Sink和Source的Processor接口，实际使用时我们也可以自己通过@Input和@Output注解来定义绑定消息通道的接口。
    // 当我们需要为@EnableBinding指定多个接口来绑定消息通道的时候，可以这样定义：@EnableBinding(value = {Sink.class, Source.class})
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }

}