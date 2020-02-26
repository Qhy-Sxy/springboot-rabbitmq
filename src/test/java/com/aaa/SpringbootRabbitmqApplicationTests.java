package com.aaa;

import com.aaa.publish.PublishSender;
import com.aaa.route.RouteSend;
import com.aaa.topic.TopicSend;
import com.aaa.work.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRabbitmqApplicationTests {
    @Autowired
    AmqpAdmin amqpAdmin;
    @Autowired
    Sender sender;
    @Autowired
    RouteSend routeSend;
    @Autowired
    TopicSend topicSend;
    @Autowired
    PublishSender publishSender;

    @Test
    void createExchange() {
        //创建publish  (fanout) 类型的交换机
        amqpAdmin.declareExchange(new FanoutExchange("amqpAdmin.fanout"));
        //创建队列
        amqpAdmin.declareQueue(new Queue("publishQueue", true));
        amqpAdmin.declareQueue(new Queue("publishQueue2", true));
        //创建绑定规则
        amqpAdmin.declareBinding(new Binding("publishQueue", Binding.DestinationType.QUEUE, "amqpAdmin.fanout", "amqp.AAA", null));
        amqpAdmin.declareBinding(new Binding("publishQueue2", Binding.DestinationType.QUEUE, "amqpAdmin.fanout", "amqp.AAA", null));
        System.out.println("创建成功");
    }

    @Test
    void createExchange2() {
        //创建route类型的交换机
        amqpAdmin.declareExchange(new DirectExchange("amqpAdmin.direct"));
        //创建队列
        amqpAdmin.declareQueue(new Queue("directQueue", true));
        amqpAdmin.declareQueue(new Queue("directQueue2", true));
        //创建绑定规则
        amqpAdmin.declareBinding(new Binding("directQueue", Binding.DestinationType.QUEUE, "amqpAdmin.direct", "amqp.BBB", null));
        amqpAdmin.declareBinding(new Binding("directQueue2", Binding.DestinationType.QUEUE, "amqpAdmin.direct", "amqp.BBB", null));
        System.out.println("创建成功");
    }

    @Test
    void createExchange3() {
        //创建topic类型的交换机
        amqpAdmin.declareExchange(new TopicExchange("amqpAdmin.topic"));
        //创建队列
        amqpAdmin.declareQueue(new Queue("topicQueue", true));
        amqpAdmin.declareQueue(new Queue("topicQueue2", true));
        //创建绑定规则
        amqpAdmin.declareBinding(new Binding("topicQueue", Binding.DestinationType.QUEUE, "amqpAdmin.topic", "amqp.*", null));
        amqpAdmin.declareBinding(new Binding("topicQueue2", Binding.DestinationType.QUEUE, "amqpAdmin.topic", "amqp.#", null));
        System.out.println("创建成功");
    }

    @Test
    void contextLoads() {
        sender.send();
    }

    @Test
        //fanout类型的发送者
    void contextLoads2() {
        publishSender.send();
    }

    @Test
        //route类型的发送者
    void contextLoads3() {
        routeSend.Routesend();
    }

    @Test
        //topic类型的发送者
    void contextLoads4() {
        topicSend.topicSend();
    }
}
