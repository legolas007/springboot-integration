package com.usher.springbootintegration.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: Usher
 * @Description:
 * 异步任务
 */
@Service
public class ASyncService {

    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Processing on...");
    }
}
