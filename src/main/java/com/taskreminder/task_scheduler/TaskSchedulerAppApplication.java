package com.taskreminder.task_scheduler;

import com.taskreminder.task_scheduler.services.TaskSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskSchedulerAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(TaskSchedulerAppApplication.class, args);
	}

}
