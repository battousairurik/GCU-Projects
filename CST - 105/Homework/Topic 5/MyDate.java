
public class MyDate {

	private static int year;
	private static int month;
	private static int day;
	
	public MyDate (){
		
	}
	public MyDate(long miliseconds){
		
	}
	public MyDate (int dateYear, int dateMonth, int dateDay){
		year = dateYear;
		month = dateMonth;
		day = dateDay;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	
}
