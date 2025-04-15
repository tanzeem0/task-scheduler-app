package com.taskreminder.task_scheduler;

import com.taskreminder.task_scheduler.services.SchedulerProperties;
import com.taskreminder.task_scheduler.services.TaskSchedulerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private final TaskSchedulerService taskSchedulerService;
    private final SchedulerProperties schedulerProperties;

    public AppRunner(TaskSchedulerService taskSchedulerService, SchedulerProperties schedulerProperties) {
        this.taskSchedulerService = taskSchedulerService;
        this.schedulerProperties = schedulerProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running Task Scheduler....");
        taskSchedulerService.runScheduler(schedulerProperties.getName(),schedulerProperties.getInterval());
    }
}
