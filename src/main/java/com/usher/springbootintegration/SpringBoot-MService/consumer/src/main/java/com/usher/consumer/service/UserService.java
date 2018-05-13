package com.usher.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.usher.provider.service.TicketService;

import org.springframework.stereotype.Service;

/**
 * @Author: Usher
 * @Description:
 */
@Service
public class UserService {
    //远程引用
    @Reference
    TicketService ticketService;

    public void userGetTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了：" + ticket);
    }

}
