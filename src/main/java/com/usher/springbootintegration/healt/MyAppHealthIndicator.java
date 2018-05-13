package com.usher.springbootintegration.healt;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Author: Usher
 * @Description:
 */
@Component
public class MyAppHealthIndicator  implements HealthIndicator{
    @Override
    public Health health() {
        //自定义检查方法
        //Health.up().build()代表健康
        return Health.down().withDetail("msg","服务正常").build();
    }
}
