
public class InstructorManager extends UserManager {

	
	
	public void giris(Instructor user) {
		super.giris(user);
		System.out.println("E�itmen Ad�:"+user.getName());
		System.out.println("E�itmen Soyad�:"+user.getSurName());
		System.out.println("E�itmen Fak�ltesi:"+user.getFaculty());
		System.out.println("E�itmen Maili:"+user.geteMail());
		System.out.println("E�itmen B�l�m�:"+user.neEgitmeni());
	}
	
	

}
