
public class Main {

	public static void main(String[] args) {
		
		Instructor Engin =new Instructor("Engin","Demirog","Mühendislik Fakültesi","edmrgg@gmail.com",5000,"Yazýlým Eðitmeni");
		Student Bunyamin=new Student("Bünyamin","Karayaðýz","Mühendislik Fakültesi","bkz@gmail.com","123456798",12,"Bilgisayar Mühendisliði");
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		instructorManager.giris(Engin);
		instructorManager.delete(Engin);
		
		studentManager.giris(Bunyamin);
		studentManager.delete(Bunyamin);
		
		

	}

}
