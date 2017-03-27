
public class Exercise_11_2_Employee extends Exercise_11_2_Person{

	public Exercise_11_2_Employee (){
		
	}
	private String employeeOffice;
	private double employeeSalary;
	
	public void createEmployee(String office, double salary){
		employeeOffice = office;
		employeeSalary = salary;
	}
	public String findOffice(){
		return employeeOffice;
	}
	public double getSalary(){
		return employeeSalary;
	}
}
