package com.junhuh741.domain.entity;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Getter
@Entity
public class File {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Comment("idx")
	@Column(name = "file_id", updatable= false , columnDefinition="int")
	private Long file_id; // DB 테이블의 'id' 컬럼과 매칭
	
    @Lob
    @Comment("blob 형태의 파일 데이터")
    @Column(name = "file_data", columnDefinition="BLOB")
    private byte[] file_data;
    

}
