import java.util.Scanner;

public class Exercise_11_17 {

	private static int size = 0;
	private static int [] factors;
	private static int userInput;
	public static void getInput(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an Integer (no decimals).");
		userInput = input.nextInt();
		input.close();
	}
	private static int y = 0;
	public static void determineFactors(){
		for(int i=2; i<=userInput; i++){
            while(userInput%i==0){
                //System.out.println(i + "| " + userInput);
                //System.out.println(" -----");
            	factors[y] = i;
            	y++;
                userInput = userInput/i;
            }
		}
	}
	public static void displayFactors(){
		for (int i = 0; i< factors.length; i++){
			System.out.print(factors[i] + ", ");
		}
	}
	public static void sizeFactors(){
		int size2 = userInput;
		for(int i=2; i<=size2; i++){
            while(size2%i==0){
                size2 = size2/i;
            	size++;
            	//System.out.println(size);
            }
		}
		factors = new int [size];
	}
	//incomplete
	public static void main(String[] args) {
		getInput();
		sizeFactors();
		determineFactors();
		displayFactors();
	}

}
