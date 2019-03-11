package com.leigq.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import reactor.util.concurrent.Queues;

/**
 * MQ测试客户端，接受消息方
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-11 17:29 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Component
@Slf4j
public class MqCustomer {

    // 1. 需手动去MQ控制面板创建 myQueue队列 @RabbitListener(queues = "myQueue")
    // 2. 自动创建队列, 使用queuesToDeclare + @Queue注解
    // @RabbitListener(queuesToDeclare = {@Queue("myQueue")})
    // 3. 自动创建与exchange绑定的Queue
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "myQueue", durable = "true"),
            exchange = @Exchange(name = "test-exchange", type = "topic")
    ))
    public void process(String msg) {
        log.warn("msg:{}", msg);
    }


    /**
     * 电脑队列
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-11 18:40
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "exchange", type = "topic"),
            value = @Queue(value = "computerQueue", durable = "true"),
            key = {"computer"}
    ))
    public void computerProcess(String msg) {
        log.warn("computer msg:{}", msg);
    }

    /**
     * 水果队列
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-11 18:40
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "exchange", type = "topic"),
            value = @Queue(value = "fruitQueue", durable = "true"),
            key = {"fruit"}
    ))
    public void fruitProcess(String msg) {
        log.warn("fruit msg:{}", msg);
    }

}
