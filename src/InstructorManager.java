
public class InstructorManager extends UserManager {

	
	
	public void giris(Instructor user) {
		super.giris(user);
		System.out.println("Eðitmen Adý:"+user.getName());
		System.out.println("Eðitmen Soyadý:"+user.getSurName());
		System.out.println("Eðitmen Fakültesi:"+user.getFaculty());
		System.out.println("Eðitmen Maili:"+user.geteMail());
		System.out.println("Eðitmen Bölümü:"+user.getNeEgitmeni());
	}
	
	

}
