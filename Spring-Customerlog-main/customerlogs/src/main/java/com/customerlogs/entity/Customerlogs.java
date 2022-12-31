package com.customerlogs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customerlogs {
	
	@Id
	private String id;
	private String name;
	private String logType;
	private String date;
	private String time;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}



}
