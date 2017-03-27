
public class Exercise_11_2_Person {

	private String name;
	private String address;
	private int phoneNumber;
	private String emailAddress;
	
	public Exercise_11_2_Person () {
	}
	public void createPerson(String pName, String addr, int phone, String email){
		name = pName;
		address = addr;
		phoneNumber = phone;
		emailAddress = email;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getPhone(){
		return phoneNumber;
	}
	public String getEmail(){
		return emailAddress;
	}
}
