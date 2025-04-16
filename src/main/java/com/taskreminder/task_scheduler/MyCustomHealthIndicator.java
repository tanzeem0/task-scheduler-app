package com.taskreminder.task_scheduler;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyCustomHealthIndicator implements HealthIndicator {
    public MyCustomHealthIndicator() {
        System.out.println("MyCustomHealthIndicator is initialized...");
    }

    @Override
    public Health health() {
        boolean isHealthy = checkAppOkay();

        if(isHealthy){
            return Health.up()
                    .withDetail("customService","Available")
                    .withDetail("description","Everything looks Good")
                    .build();
        }else{
            return Health.down()
                    .withDetail("customService","Not reachable")
                    .withDetail("error","Something went wrong internally")
                    .build();
        }
    }

    private boolean checkAppOkay() {
        double random = Math.random();
        return random > 0.9;
    }
}
