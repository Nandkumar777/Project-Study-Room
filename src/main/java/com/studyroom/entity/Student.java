package com.studyroom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//student Entity class
@Entity
@Table(name="student_details")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ Auto-generate ID
 private  Integer sId;
 private String sName;
 private String sAddress;
public Integer getsId() {
	return sId;
}
public void setsId(Integer sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsAddress() {
	return sAddress;
}
public void setsAddress(String sAddress) {
	this.sAddress = sAddress;
}
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer sId, String sName, String sAddress) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.sAddress = sAddress;
}

 
 }
