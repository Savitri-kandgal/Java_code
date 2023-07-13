package com.xworkz.parkingrental.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="user_registration")
@NamedQuery(name="findByUserEmail", query = "select aa from UserEntity aa where aa.email=:mail")
public class UserEntity {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phoneNo;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "CreatedDate")
	private String createdDate;
	
	@Column(name = "UpdatedBy")
	private String updatedBy;
	
	@Column(name = "UpdatedDate")
	private String updatedDate;
	
	@Column(name = "OTP")
	private Integer otp;

	@Column(name = "OTP_Count")
	private int otpCount;
	
	@Column(name = "Acct_Status")
	private String AcctStatus; 
	
	@Column(name = "OTP_Expiry_Time")
	private LocalTime otpExpiryTime;
	
	public UserEntity() {
		log.info("created: "+this.getClass().getSimpleName());
	}
}
