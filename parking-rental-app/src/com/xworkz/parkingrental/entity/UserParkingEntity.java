package com.xworkz.parkingrental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import com.xworkz.parkingrental.dto.UserParkingDTO;

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
@Table(name="user_parkingInfo")
@NamedQuery(name="findAllByUserId", query = "select aa from UserParkingEntity aa where aa.userId=:uId")
@NamedQuery(name="findByVehicleNo", query = "select aa from UserParkingEntity aa where aa.vehicleNo=:vNo")
public class UserParkingEntity {

	@Id
	private int id;
	@Column(name="userId_fk")
	private int userId;
	private String location;
	private String vehicleNo;
	private String vehicleType;
	private String engineType;
	private String classification;
	private String term;
	private int price;
	private int discount;
	private int totalAmount;
	
	public UserParkingEntity() {
		log.info("Created: "+getClass().getSimpleName());
	}
}
