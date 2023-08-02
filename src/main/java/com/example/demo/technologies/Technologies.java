package com.example.demo.technologies;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "technologies")
public class Technologies {

	@Id
	private Integer id;
	
	private String name;
	private Integer year;
	private String company;
	
	public Technologies() {}
	
	public Technologies(Integer id, String name, Integer year, String company) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.company = company;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Technologies [name=" + name + ", year=" + year + ", company=" + company + "]";
	}

	
	
}
