package com.aaa.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/9 - 16:06
 */
@Component
public class TopicSend {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void topicSend() {
        //发送topic模式
        amqpTemplate.convertAndSend("amqpAdmin.topic", "amqp.TTT.1", "小悦悦哈哈哈爱你爱你");
    }
}
