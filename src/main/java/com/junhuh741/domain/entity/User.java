package com.junhuh741.domain.entity;

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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", updatable= false , columnDefinition="int")
	private Long user_id; // DB 테이블의 'id' 컬럼과 매칭
	
	@Column(name = "name", nullable = false, columnDefinition="varchar(20)")
	private String name; // DB 테이블의 'name' 컬럼과 매칭
	
	@Column(name = "status", columnDefinition="varchar(10)")
	private String status;
}
