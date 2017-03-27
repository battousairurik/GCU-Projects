
public class Exercise_11_2_Staff extends Exercise_11_2_Employee{

	public Exercise_11_2_Staff(){
		
	}
	private String staffTitle;
	public void createStaff(String stTitle){
		staffTitle = stTitle;
	}
	public String getTitle(){
		return staffTitle;
	}
}
