package com.studentManagementModel;

import java.time.LocalDate;

public class Student {

	String frn;
	String email;
	long mobNo;
	String name;
	String githubRepo;
	LocalDate dob;

	public Student() {

	}

	// parameterized Constructor
	public Student(String frn, String email, long mobNo, String name, String githubRepo, LocalDate dob) {
		this.frn = frn;
		this.email = email;
		this.mobNo = mobNo;
		this.name = name;
		this.githubRepo = githubRepo;
		this.dob = dob;
	}

	public String getFrn() {
		return frn;
	}

	public void setFrn(String frn) {
		this.frn = frn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGithubRepo() {
		return githubRepo;
	}

	public void setGithubRepo(String githubRepo) {
		this.githubRepo = githubRepo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "StudentManagement [frn=" + frn + ", email=" + email + ", mobNo=" + mobNo + ", name=" + name
				+ ", githubRepo=" + githubRepo + ", dob=" + dob + "]";
	}

}
