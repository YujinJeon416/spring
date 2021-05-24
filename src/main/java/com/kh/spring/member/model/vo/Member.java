package com.kh.spring.member.model.vo;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	@NotNull
	private String id;
	
	private String password;
	private String name;
	private String gender;
	private Date birthday;
	private String email;
	private String phone;
	private String address;
	private String[] hobby;
	private Date enrollDate;
	private boolean enabled;     //회원활성화 여부 true(1), false(0)
	

}
