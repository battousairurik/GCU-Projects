package TimeConversions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion2 {

	public static void main(String[] args) throws ParseException 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time which you wish to convert: ");
		//String time1 = input.next();
		DateFormat df = new SimpleDateFormat("HH.mm");
		DateFormat dfout = new SimpleDateFormat("H:mm a");
		Date date  = df.parse(input.next());
		input.close();
		System.out.println(dfout.format(date));
	}

}
