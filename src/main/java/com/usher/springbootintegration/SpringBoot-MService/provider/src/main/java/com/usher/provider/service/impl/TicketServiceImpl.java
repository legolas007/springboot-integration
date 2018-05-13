package com.usher.provider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.usher.provider.service.TicketService;
import org.springframework.stereotype.Component;



/**
 * @Author: Usher
 * @Description:
 */
@Component
@Service//发布服务
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "SpringBoot 微服务";
    }
}
