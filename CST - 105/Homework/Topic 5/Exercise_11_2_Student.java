
public class Exercise_11_2_Student extends Exercise_11_2_Person{

	public Exercise_11_2_Student (String status){
		studentStatus = status;
	}
	private final String studentStatus;
	
	public String getStatus (){
		return studentStatus;
	}
	
}
