
public class StudentManager extends UserManager {

	
	public void giris(Student user) {
		
		super.giris(user);
		System.out.println("Öðrenci Adý:"+user.getName());
		System.out.println("Öðrenci Soyadý:"+user.getSurName());
		System.out.println("Öðrenci Numarasý:"+user.getStudentNumber());
		System.out.println("Öðrenci Maili:"+user.geteMail());
		System.out.println("Öðrenci Fakültesi:"+user.getFaculty());
		System.out.println("Öðrenci Bölümü:"+user.getBolum());
		System.out.println("Öðrencinin Ders Sayýsý:"+user.getNumberOfLessons());
			
	}
	
	
	//Override gibi iş görüyor ama "@Override" olduğunda hata alıyorum.
	//Çözümü için parametre kısmını "User" yerinde "Student" yaptım.
	public void delete(Student userDelete) {
		super.delete(userDelete);
		userDelete.setBolum(null);
		userDelete.setNumberOfLessons(0);
		userDelete.setStudentNumber(null);
		
	}
	
	
	
	
	

}
