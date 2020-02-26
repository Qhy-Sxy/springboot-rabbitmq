package com.aaa.route;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/9 - 15:40
 */
@Component
public class RouteSend {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void Routesend() {
        //发送广播路由模式
        amqpTemplate.convertAndSend("amqpAdmin.direct", "amqp.BBB", "钱浩洋哈哈哈爱你爱你");
    }
}
