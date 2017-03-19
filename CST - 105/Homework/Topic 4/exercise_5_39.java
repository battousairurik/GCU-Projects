
public class exercise_5_39 {
	private static double baseSalary = 5000.00;
	private static double sales = 10000;
	private static double comission = 0;
	public static double calculateComission(){
		while (comission < 25000){
			if (sales <= 5000)
				comission = sales * 0.08;
			if (sales <= 10000)
				comission = (5000 * 0.08) + ((comission - 5000) * 0.1);
			if (sales > 10000)
				comission = (5000 * 0.08) + (5000 * 0.1) + ((comission - 10000) * 0.12);
			sales += 5000;
			return sales;
		}
		return comission;
	}
	public static void printComission(){
		System.out.println("The minimum sales needed to make $30,000 per year are: " + sales);
	}
	public static void main(String[] args) {
		calculateComission();
		printComission();
		
	}

}
