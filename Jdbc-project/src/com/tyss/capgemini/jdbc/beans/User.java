package com.tyss.capgemini.jdbc.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private Integer userid;
	private String username;
	private String  email;
	private String password;

}
