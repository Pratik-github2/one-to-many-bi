package com.jsp.student.course.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String gmail;
private long cno;

@OneToMany
private List<Course> course;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGmail() {
	return gmail;
}

public void setGmail(String gmail) {
	this.gmail = gmail;
}

public long getCno() {
	return cno;
}

public void setCno(long cno) {
	this.cno = cno;
}

public List<Course> getCourse() {
	return course;
}

public void setCourse(List<Course> course) {
	this.course = course;
}




}
