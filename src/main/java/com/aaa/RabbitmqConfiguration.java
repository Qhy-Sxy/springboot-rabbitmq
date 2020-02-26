package com.aaa;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author 钱浩洋
 * @date 2019/12/8 - 16:52
 */
@Configuration
public class RabbitmqConfiguration {
    @Bean
    public Queue queue() {
        return new Queue("orderQueue");
    }
}
