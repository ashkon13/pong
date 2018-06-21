package com.retreat.pingpong.user.datafields;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class UserNameCompositeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3904203151745944213L;

	@Getter
	@Setter
	@NonNull
	@Size(max = 20)
	@Column(name ="P01_USER_NAME")
	private String userName;
	
	@Getter
	@Setter
	@NonNull
	@Size(max = 45)
	@Column(name ="P01_EMAIL_ID")
	private String emailId;
	
}
