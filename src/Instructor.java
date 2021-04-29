
public class Instructor extends User{
	
	private double salary;
	private String neEgitmeni;
	
	
	
	
	public Instructor(String name, String surName, String faculty, String eMail, double salary,
			String neEgitmeni) {
		super(name, surName, faculty, eMail);
		this.salary = salary;
		this.neEgitmeni = neEgitmeni;
	}
	
	
	
	
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNeEgitmeni() {
		return neEgitmeni;
	}
	public void setNeEgitmeni(String neEgitmeni) {
		this.neEgitmeni = neEgitmeni;
	}
	
	
	

}
