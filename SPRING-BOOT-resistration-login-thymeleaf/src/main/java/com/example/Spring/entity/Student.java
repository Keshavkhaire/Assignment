package com.example.Spring.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String studentname;
	private String course;
	private int fee;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, fee, id, studentname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && fee == other.fee && Objects.equals(id, other.id)
				&& Objects.equals(studentname, other.studentname);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", course=" + course + ", fee=" + fee + "]";
	}
	public Student(Long id, String studentname, String course, int fee) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
