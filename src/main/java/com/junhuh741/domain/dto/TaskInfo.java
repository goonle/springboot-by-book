package com.junhuh741.domain.dto;

import java.sql.Timestamp;

import com.junhuh741.domain.entity.Task;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskInfo {
	
	private int task_id;
	private Timestamp reg_dt;
	private int sorting;
	private String description;
	private String type;
	
	public static TaskInfo of(Task task) {
		return TaskInfo.builder().
				.taskId(task.getTaskId())build();
	}
	
}
