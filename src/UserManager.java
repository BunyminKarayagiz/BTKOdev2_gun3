
public class UserManager {
	
	
	public void giris(User user) {
		System.out.println("=============================="+user.getSchoolName()+ " Resmi Sayfasıdır =======================================");
		System.out.println("Üniversiteye Giriş Yaptı:");
		System.out.println(">>> Giriş Yapan Kişinin Bilgileri: <<<");
		
	}
	
	//Burada Veriler Silinmektedir.
	public void delete(User userDelete) {
		
		System.out.println(">>>>>>>> Kullanici Silindi <<<<<<<< ");
		System.out.println("\n Silinen Kullanicinin Ismi ve Soyismi: ");
		System.out.println("Isim: "+userDelete.getName());
		System.out.println("Soyisim: "+userDelete.getSurName()+"\n\n\n");
		userDelete.seteMail(null);
		userDelete.setFaculty(null);
		userDelete.setName(null);
		userDelete.setSurName(null);
	}

}
