package com.junhuh741.Entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Getter
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id", updatable = false)
	private Long task_id;
	
	@Column(name = "user_id")
	private Long user_id;
	
	@Column(name = "reg_dt")
	private Timestamp reg_dt;
	
	@Column(name = "order")
	private int order;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "file_id")
	private int file_id;
	
}



