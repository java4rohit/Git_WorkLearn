package com.java4rohit.fullbackend.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String username;
	@NotNull
	private String name;
	private String email;
	private Long aadhaarNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id" ,referencedColumnName = "id")
	private Address address;

}
