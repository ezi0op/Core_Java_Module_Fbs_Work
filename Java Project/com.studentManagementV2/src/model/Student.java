package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

	String frn;
	String email;
	long mobNo;
	String name;
	String githubRepo;
	LocalDate dob;
	ArrayList<MockDetail> mockdetails;

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
		mockdetails = new ArrayList<MockDetail>();
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

	public ArrayList<MockDetail> getMockdetails() {
		// TODO Auto-generated method stub
		if (mockdetails == null) {
	        mockdetails = new ArrayList<>();
	    }
	    return mockdetails;
	}

	public void setMockdetails(ArrayList<MockDetail> mockdetails) {
		this.mockdetails = mockdetails;
	}

	@Override
	public String toString() {
		return "StudentManagement [frn=" + frn + ", email=" + email + ", mobNo=" + mobNo + ", name=" + name
				+ ", githubRepo=" + githubRepo + ", dob=" + dob + "]";
	}

}
