package com.usher.springbootintegration.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author: Usher
 * @Description:
 */
@Service
public class ScheduledService {

    /**
     * 秒，分，时，日
     */
    @Scheduled(cron = "0 * * * * MON-SAT")//定时任务
    public void hello(){
        System.out.println("hello ... ");
    }
}
