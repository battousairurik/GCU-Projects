

public class Exercise_11_2_Faculty extends Exercise_11_2_Employee{

	public Exercise_11_2_Faculty(){
		
	}
	private int openingHour;
	private int closingHour;
	private String facultyRank;
	
	public void createFaculty(int open, int close, String rank){
		openingHour = open;
		closingHour = close;
		facultyRank = rank;
	}
	public int getOpen(){
		return openingHour;
	}
	public int getClose(){
		return closingHour;
	}
	public String getRank(){
		return facultyRank;
	}
}
