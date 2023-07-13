package com.xworkz.parkingrental.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "admin_details")
@NamedQuery(name="findAll", query = "select aa from ParkingEntity as aa")
@NamedQuery(name="findNameAndLoginTime", query = "select aa.name, aa.loginTime from ParkingEntity as aa where aa.id=:ss")
@NamedQuery(name="findByEmail", query = "select aa from ParkingEntity as aa where aa.adminEmail=:ss")
public class ParkingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String adminEmail;
	private String password;
	private String loginTime;
	private String created_by;
	private String updated_by;
	private String created_date;
	private String updated_date;
		
	public ParkingEntity() {
		log.info("Created: "+getClass().getSimpleName());
	}
}
