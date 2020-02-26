package com.aaa.work;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2019/12/8 - 17:03
 */
/*@Component
@RabbitListener(queues = "orderQueue")*/
public class Recver2 {
   /* @RabbitHandler
    public void proccess(String orderMessage){
        System.out.println("qhy进行消费了,单号是+"+orderMessage);
    }*/
}
