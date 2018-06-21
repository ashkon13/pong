package com.retreat.pingpong.user.datafields;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@EmbeddedId
	private UserNameCompositeKey userNameCompositeKey;
	
	@NotBlank
	@Size(max = 45)
	@Column(name ="P01_F_NAME")
	private String firstName;
	
	@NotBlank
	@Size(max = 45)
	@Column(name ="P01_L_NAME")
	private String lastName;
	
	@NotBlank
	@Size(max = 20)
	@Column(name ="P01_PASSWORD")
	private String password;

}
