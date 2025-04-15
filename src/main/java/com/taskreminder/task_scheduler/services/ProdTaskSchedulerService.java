package com.taskreminder.task_scheduler.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdTaskSchedulerService  implements TaskSchedulerService{
    @Override
    public void runScheduler(String name, int value) {
        System.out.println("Running PROD scheduler....");
    }
}
