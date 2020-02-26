package com.aaa.work;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author 钱浩洋
 * @date 2019/12/8 - 16:55
 */
@Component
public class Sender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send() {
     /*   String orderMessage= UUID.randomUUID().toString();
        System.out.println("编号为+"+orderMessage);*/
        for (int i = 0; i < 100; i++) {
            amqpTemplate.convertAndSend("orderQueue", "孙新悦哈哈哈爱你爱你" + i);
        }

    }
}
