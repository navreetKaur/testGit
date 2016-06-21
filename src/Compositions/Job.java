package Compositions;

public class Job {
	private String role;
	private long salary;
	private int id;
	private static int count = 1;
	
	public Job (String role, long salary) {
		this.role = role;
		this.salary = salary;
		id = count;
		count++;
	}
	
	public String getRole() {
	    return role;
	}
	public void setRole(String role) {
	    this.role = role;
	}
	public long getSalary() {
	    return salary;
	}
	public void setSalary(long salary) {
	    this.salary = salary;
	}
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	@Override
	public String toString() {
		return "Salary: " + salary + " Role: " + role + " ID: " + id;
	}

}
