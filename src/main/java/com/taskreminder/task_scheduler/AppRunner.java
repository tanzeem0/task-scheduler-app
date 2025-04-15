package com.taskreminder.task_scheduler;

import com.taskreminder.task_scheduler.services.TaskSchedulerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private final TaskSchedulerService taskSchedulerService;

    public AppRunner(TaskSchedulerService taskSchedulerService) {
        this.taskSchedulerService = taskSchedulerService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running Task Scheduler....");
        taskSchedulerService.runScheduler();
    }
}
