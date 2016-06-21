package Compositions;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private Job job;
	private Education education;
	public Person(){
	    this.job=new Job("Systems Engineer", 1000L);
	    List<String> schools = new ArrayList<String>();
		schools.add("GWU");
		schools.add("Sir MVIT");
		schools.add("KV Bidar");
	    this.education = new Education(schools);
	}
	public long getSalary() {
	    return job.getSalary();
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	
	@Override
	public String toString() {
		return job.toString() + "\nSchools:" + education.toString();
		
	}

}
