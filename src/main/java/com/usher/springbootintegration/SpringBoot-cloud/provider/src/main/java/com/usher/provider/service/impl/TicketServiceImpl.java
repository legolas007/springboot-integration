package com.usher.provider.service.impl;

import com.usher.provider.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @Author: Usher
 * @Description:
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《复仇者联盟3》";
    }
}
