package com.aaa.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/9 - 16:06
 */
@Component
//@RabbitListener(queues = "topicQueue")
public class TopicRecive1 {
    @RabbitHandler
    public void proccess(String orderMessage) {
        System.out.println("sxy_topic进行消费了,是+" + orderMessage);
    }

}
