
public class Main {

	public static void main(String[] args) {
		
		Instructor Engin =new Instructor("Engin","Demiro�","M�hendislik Fak�ltesi","edmrgg@gmail.com",5000,"Yaz�l�m E�itmeni");
		Student Bunyamin=new Student("B�nyamin","Karaya��z","M�hendislik Fak�ltesi","bkz@gmail.com","123456798",12,"Bilgisayar M�hendisli�i");
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		instructorManager.giris(Engin);
		studentManager.giris(Bunyamin);
		

	}

}
