package com.lr.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class JmsComponent {
    //spring提供的消息发送模板
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    Queue queue;

    //生产者
    public void send(Message message) {
        jmsMessagingTemplate.convertAndSend(this.queue,message);
    }

    //消费者
    @JmsListener(destination = "apple")
    public void receive(Message message) {
        System.out.println("收到"+message);
    }

}
