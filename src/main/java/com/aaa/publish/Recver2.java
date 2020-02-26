package com.aaa.publish;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/8 - 17:03
 */
@Component
//@RabbitListener(queues = "publishQueue2")
public class Recver2 {
    @RabbitHandler
    public void proccess(String orderMessage) {
        System.out.println("qhy_publish进行消费了,是+" + orderMessage);
    }
}
