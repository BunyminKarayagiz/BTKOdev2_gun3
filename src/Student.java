
public class Student extends User{
	
	private String studentNumber;
	private int numberOfLessons;
	private String bolum;
	
	
	

	public Student(String name, String surName, String faculty, String eMail, String studentNumber,
			int numberOfLessons, String bolum) {
		super(name, surName,  faculty, eMail);
		this.studentNumber = studentNumber;
		this.numberOfLessons = numberOfLessons;
		this.bolum = bolum;
	}
	
	
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getNumberOfLessons() {
		return numberOfLessons;
	}
	public void setNumberOfLessons(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolumm(String bolum) {
		this.bolum = bolum;
	}
	
	
	
	
	

}
