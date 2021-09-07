package com.sjq.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author user
 */
@Slf4j
@RestController
public class ClientController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
    @ResponseBody
    public String send(@PathVariable String msg) {
        try {
            log.info("send message:{}", msg);
            rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUNTING_KEY, msg);
            return "ok";
        } catch (AmqpException e) {
            log.error("发送消息异常：{}", e.getMessage());
            return "error";
        }
    }

}
