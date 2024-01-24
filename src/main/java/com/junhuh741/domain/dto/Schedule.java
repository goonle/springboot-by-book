package com.junhuh741.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Schedule {
	
	private String user_id;
	private String user_nm;
	private String status;
	
	
}
