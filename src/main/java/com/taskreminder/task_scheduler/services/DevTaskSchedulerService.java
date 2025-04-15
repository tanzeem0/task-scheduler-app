package com.taskreminder.task_scheduler.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevTaskSchedulerService implements TaskSchedulerService {

    @Override
    public void runScheduler(String name,int value) {
        System.out.println("Running " + name + " DEV scheduler..... at every " + value + " secs");
    }
}
