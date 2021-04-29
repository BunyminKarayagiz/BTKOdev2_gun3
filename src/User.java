
public class User {
	private String name;
	private String surName;
	private String schoolName;
	private String faculty;
	private String eMail;
	
	
	public User(String name, String surName, String faculty, String eMail) {
		super();
		this.name = name;
		this.surName = surName;
		this.faculty = faculty;
		this.eMail = eMail;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
	
	public String geteMail() {
		if(eMail.contains("@")) return eMail;
		
		else return "Geçersiz E-Mail adresi!!";
	}
	
	
	
	
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getSchoolName() {
		return "Pamukkale Üniversitesi" ;
	}
	
	

}
