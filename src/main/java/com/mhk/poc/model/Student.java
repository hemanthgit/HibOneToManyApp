package com.mhk.poc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long studentId;
	
	@Column(name = "NAME", nullable = false)
	private String studentName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_PHONE", 
			   joinColumns = { @JoinColumn(name = "STUDENT_ID") }, 
			   inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>(0);

	public Student() {
	}

	public Student(String studentName, Set<Phone> studentPhoneNumbers) {
		this.studentName = studentName;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Phone> getStudentPhoneNumbers() {
		return this.studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhoneNumbers="
				+ studentPhoneNumbers + "]";
	}
}
