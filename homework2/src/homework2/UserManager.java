package homework2;



public class UserManager {
	public void signUp(User user) {
		System.out.println(user.courseName + "  �grenci Giri�i Yap�ld�..");
	}
	
	
	//bulk insert
	public void addMultipleMembers(User[] users) {
		for (User user : users ) {
			signUp(user);
			
		}
	}
  
}
