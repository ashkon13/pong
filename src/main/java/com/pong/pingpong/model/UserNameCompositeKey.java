package com.pong.pingpong.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class UserNameCompositeKey {

	@Getter
	@Setter
	@NonNull
	@Column(name ="P01_USER_ID")
	private String userId;
	
	@Getter
	@Setter
	@NonNull
	@Column(name ="P01_USER_NAME")
	private String userName;
	
	@Getter
	@Setter
	@NonNull
	@Column(name ="P01_EMAIL_ID")
	private String emailId;
	
	
}
