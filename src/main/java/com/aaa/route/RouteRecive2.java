package com.aaa.route;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/9 - 15:48
 */
@Component
//@RabbitListener(queues = "directQueue2")
public class RouteRecive2 {
    @RabbitHandler
    public void proccess(String orderMessage) {
        System.out.println("qhy_direct进行消费了,是+" + orderMessage);
    }

}
