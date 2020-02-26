package com.aaa.publish;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/8 - 17:03
 */
@Component
//@RabbitListener(queues = "publishQueue")
public class Recver1 {
    @RabbitHandler
    public void proccess(String orderMessage) {
        System.out.println("sxy_publish进行消费了,是+" + orderMessage);
    }
}
