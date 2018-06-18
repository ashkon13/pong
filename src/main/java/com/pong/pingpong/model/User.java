package com.pong.pingpong.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "PP01_USER", uniqueConstraints = { 
		@UniqueConstraint(columnNames = {
            "P01_USER_NAME"
        }),
        @UniqueConstraint(columnNames = {
            "P01_EMAIL_ID"
        })
})
@Slf4j
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@NotBlank
	@Size(max = 40)
	@Column
	private String firstName;
	
	@NotBlank
	@Size(max = 40)
	private String lastName;
	
	@NotBlank
	@Size(max = 15)
	private String userName;
	
	@NaturalId
	@NotBlank
	@Size(max = 40)
	private String email;

//	@EmbeddedId
//	private UserNameCompositeKey userNameCompositeKey;
	
	
}
