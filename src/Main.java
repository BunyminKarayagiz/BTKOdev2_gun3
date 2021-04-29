
public class Main {

	public static void main(String[] args) {
		
		Instructor Engin =new Instructor("Engin","Demiroğ","Mühendislik Fakültesi","edmrgg@gmail.com",5000,"Yazılım Eğitmeni");
		Student Bunyamin=new Student("Bünyamin","Karayağız","Mühendislik Fakültesi","bkz@gmail.com","123456798",12,"Bilgisayar Mühendisliği");
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		instructorManager.giris(Engin);
		studentManager.giris(Bunyamin);
		

	}

}
