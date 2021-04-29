
public class InstructorManager extends UserManager {

	
	
	public void giris(Instructor user) {
		super.giris(user);
		System.out.println("Eðitmen Adý:"+user.getName());
		System.out.println("Eðitmen Soyadý:"+user.getSurName());
		System.out.println("Eðitmen Fakültesi:"+user.getFaculty());
		System.out.println("Eðitmen Maili:"+user.geteMail());
		System.out.println("Eðitmen Bölümü:"+user.getNeEgitmeni());
	}
	
	
	//Override gibi iş görüyor ama "@Override" olduğunda hata alıyorum.
	//Çözümü için parametre kısmını "User" yerinde "Instructor" yaptım.
	public void delete(Instructor userDelete) {
		super.delete(userDelete);
		userDelete.setSalary(0);
		userDelete.setNeEgitmeni(null);	
	}
	
	

}
