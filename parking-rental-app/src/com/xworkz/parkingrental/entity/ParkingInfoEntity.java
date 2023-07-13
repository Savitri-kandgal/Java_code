package com.xworkz.parkingrental.entity;

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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Slf4j
@Table(name="parking_info")
@NamedQuery(name="findByLTTCT", query="select aa from ParkingInfoEntity aa where aa.location=:lc and aa.vehicleType=:vtype and aa.engineType=:etype and aa.classification=:cls and aa.term=:trm")
@NamedQuery(name="findByPrice", query="select aa from ParkingInfoEntity aa where aa.price=:prc")
@NamedQuery(name="findByPriceAndDiscount", query="select aa from ParkingInfoEntity aa where aa.price=:prc and aa.discount=:dis")
@NamedQuery(name="findByLocation", query = "select entity from ParkingInfoEntity entity where entity.location=:lc")
public class ParkingInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Location")
	private String location;
	@Column(name="Vehicle_Type")
	private String vehicleType;
	@Column(name="Engine_type")
	private String engineType;
	@Column(name="V_Classification")
	private String classification;
	@Column(name="Term")
	private String term;
	@Column(name="Price")
	private int price;
	@Column(name="Discount")
	private String discount;
	
	public ParkingInfoEntity(){
		log.info("Created: "+getClass().getSimpleName());
	}
}
