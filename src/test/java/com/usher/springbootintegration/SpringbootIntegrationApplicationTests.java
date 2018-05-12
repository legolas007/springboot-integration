package com.usher.springbootintegration;

import com.usher.springbootintegration.mq.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootIntegrationApplicationTests {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
    AmqpAdmin amqpAdmin;


	@Test
    public void createExchange(){
	    amqpAdmin.declareExchange(new DirectExchange("amqpadmin:exchange"));
        System.out.println("Create Success");
    }

    /**
     * 单播（点对点
     */

	@Test
	public void contextLoads() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg","message!");
        map.put("data", Arrays.asList("hello",123,true));

        //rabbitTemplate.convertAndSend("exchange.direct","mq3",map);
        rabbitTemplate.convertAndSend("exchange.direct","mq3",new Book("Robbot","usher"));

	}

	@Test
    public void reveive(){
	    Object o = rabbitTemplate.receiveAndConvert("mq3");
	    System.out.println(o.getClass());
	    System.out.println(o);
    }

}
