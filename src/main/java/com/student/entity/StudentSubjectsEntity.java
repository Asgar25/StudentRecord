/**
 * 
 */
package com.student.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author sumit
 *
 */
@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "student_subjects")
public class StudentSubjectsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Student_subjects")
	private String subjectName;
	
	@JsonIgnore	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "student_record_entity_id", insertable = false, updatable = false)
	private StudentRecordEntity studentRecordEntity;
}
