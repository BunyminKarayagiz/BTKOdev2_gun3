
public class StudentManager extends UserManager {

	
	public void giris(Student user) {
		
		
		super.giris(user);
		System.out.println("��renci Ad�:"+user.getName());
		System.out.println("��renci Soyad�:"+user.getSurName());
		System.out.println("��renci Numaras�:"+user.getStudentNumber());
		System.out.println("��renci Maili:"+user.geteMail());
		System.out.println("��renci Fak�ltesi:"+user.getFaculty());
		System.out.println("��renci B�l�m�:"+user.getBolum());
		System.out.println("��rencinin Ders Say�s�:"+user.getNumberOfLessons());
			
	}
	
	
	
	
	

}
