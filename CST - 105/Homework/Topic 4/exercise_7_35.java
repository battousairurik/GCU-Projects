import java.util.Random;
import java.util.Scanner;

public class exercise_7_35 {
	
	private static String [] words = {"love", "friendship", "magic", "turtle", "kitten", "pie" 
			+ "armadillo", "pizza", "excitement", "tools" };
	private static char [] currentChoice;
	private static boolean continueGame = true;
	private static char userChoice = ' ';
	static Scanner input = new Scanner (System.in);
	private static char [] wordProgress;
	
	public static void runGame(){
		while (continueGame == true){
			selectWord();
			//acceptInput();
			//initializeString();
			printWord();
			System.out.print(currentChoice);
		}
	}
	public static char [] selectWord(){
		Random r1 = new Random();
		int choice = r1.nextInt(11);
		currentChoice = words[choice].toCharArray();
		return currentChoice;
	}
	public static char [] initializeString(){
		int x = 0;
		while (x < currentChoice.length - 1){
			wordProgress[x] = currentChoice[x];
		}
		return wordProgress;
	}
	public static char acceptInput(){
		System.out.print("Choose a letter: ");
		userChoice = input.next().charAt(0);
		return userChoice;
	}
	
	public static void printWord(){
		int x = 0;
		while (x < wordProgress.length - 1){
			System.out.print(wordProgress[x++]);
		}
	}
	public static void main(String[] args) {
		runGame();
	}

}
