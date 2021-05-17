package homework2;

public class Main {

	public static void main(String[] args) {
	
		InstructorManager israfil=new InstructorManager();
		israfil.courseName="Java";
		
		StudentManager manager=new StudentManager();
		manager.courseName="C#";
		
		UserManager userManager=new UserManager();
		User [] users= {israfil,manager};
		userManager.addMultipleMembers(users);
	
		

	}

}
