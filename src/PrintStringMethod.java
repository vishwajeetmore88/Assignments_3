
public class PrintStringMethod {

 	String getStudentName(String name) {
		
		return name;
	}
	
	public static void main(String[] args) {
		
		PrintStringMethod printstringmethod =new PrintStringMethod();
		String Studentname =printstringmethod.getStudentName("Vishwajeet");
		System.out.println("Student Name is " +Studentname);
	}
}
