package com.aaa.publish;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/8 - 16:55
 */
@Component
public class PublishSender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send() {
     /*   String orderMessage= UUID.randomUUID().toString();
        System.out.println("编号为+"+orderMessage);*/
        //发送广播模式
        amqpTemplate.convertAndSend("amqpAdmin.fanout", "", "孙新悦哈哈哈爱你爱你");
    }
}
