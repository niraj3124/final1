package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="query",query="select obj from ScheduledSessions obj")
@Table(name="ScheduledSessions")
public class ScheduledSessions {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="duration")
	private int duration;
	@Column(name="faculty")
	private String faculty;
	@Column(name="mode1")
	private String mode1;
	
	
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMode1() {
		return mode1;
	}
	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	
	@Override
	public String toString() {
		return "ScheduledSessions [id=" + id + ", name=" + name + ", duration="
				+ duration + ", faculty=" + faculty + ", mode1=" + mode1 + "]";
	}
	
	
	
	

}
