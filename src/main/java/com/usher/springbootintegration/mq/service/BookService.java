package com.usher.springbootintegration.mq.service;

import com.usher.springbootintegration.mq.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


/**
 * @Author: Usher
 * @Description:
 */
@Service
public class BookService {

    //消息监听
    @RabbitListener(queues = "mq3")
    public void receive(Book book){
        System.out.println("Receive message:" + book);
    }

    @RabbitListener(queues = "mq3")
    public void receive2(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
