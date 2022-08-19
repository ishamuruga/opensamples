package com.apstore.api.pos.posapiserver2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
    private String username;
	private String password;
	private String[] role;
}
