package Compositions;

import java.util.List;

public class Education {
	private List<String> schools;
	public Education(List<String> schools) {
		this.schools = schools;
		
	}
	public List<String> getSchools() {
		return schools;
	}
	public void setSchools(List<String> schools) {
		this.schools = schools;
	}
	@Override
	public String toString() {
		String output = "";
		for(String in: schools) 
			output += in + ",";
		return output;
	}
	
}
