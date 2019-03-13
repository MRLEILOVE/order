package com.leigq.order.message.rabbitmq;

import com.leigq.order.OrderApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * MQ 消息发送方
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-11 17:31 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Slf4j
public class MqSender extends OrderApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void sendMsg() {
        rabbitTemplate.convertAndSend("myQueue", LocalDateTime.now());
        log.warn("sendMsg:{}", "sendMsg");
    }

    /**
     * 发送消息至对应routingKey的队列
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-11 18:48
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     */
    @Test
    public void sendOrderMsg() {
        rabbitTemplate.convertAndSend("exchange", "computer", LocalDateTime.now());
    }


}
