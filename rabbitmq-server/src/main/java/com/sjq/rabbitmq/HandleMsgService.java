package com.sjq.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HandleMsgService {

//    @RabbitListener(queues = "test.queue")
//    public void handle1(String msg) {
//        log.info("方法1已接收到消息：{}", msg);
//    }

    @RabbitListener(queues = "biz-operation-cost-log2")
    public void handle2(String msg) {
        log.info("方法2已接收到消息：{}", msg);
    }

}
