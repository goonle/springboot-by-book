package com.junhuh741.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access =AccessLevel.PUBLIC)
@AllArgsConstructor
@Getter
@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="cate_id", updatable = false)
	private Long cate_id;
	
	@Column(name ="group_nm")
	private String group_nm;
	
	@Column(name ="cate_nm")
	private String cate_nm;

	@Column(name ="cate_cd")
	private String cate_cd;
	
}
