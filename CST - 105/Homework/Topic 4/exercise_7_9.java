import java.util.Arrays;
import java.util.Scanner;

public class exercise_7_9 {

	private static double [] minSet = new double [10];
	private static double setMin;
	public static void getInput() {
		int x = 0;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your ten numbers: ");
		while (x < 10){
			minSet[x] = input.nextDouble();
			x++;
		}
		input.close();
	}
	public static double min (double [] minSet){
		Arrays.sort(minSet);
		setMin = minSet[0];
		return setMin;
	}
	public static void main(String[] args) {
		getInput();
		min(minSet);
		System.out.println("The minimum for the array is " + setMin);
	}

}
