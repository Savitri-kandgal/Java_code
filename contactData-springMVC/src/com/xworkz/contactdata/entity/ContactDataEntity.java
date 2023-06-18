package com.xworkz.contactdata.entity;

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

@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Slf4j
@Table(name = "contact_data")
@Entity
@NamedQuery(name = "findAll", query = "select aa from ContactDataEntity as aa")
@NamedQuery(name = "findByName", query = "select als from ContactDataEntity as als where als.name like :nm")
public class ContactDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String mobileNo;
	private String comments;
	private String fileName;
	private String originalFileName;
	private String contentType;
	private long fileSize;

	public ContactDataEntity() {
		log.info("Created: " + this.getClass().getSimpleName());
	}

}
