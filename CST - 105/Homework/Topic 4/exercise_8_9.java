import java.util.Scanner;

public class exercise_8_9 {

	private static char [] row1 = {'1', '2', '3'};
	private static char [] row2 = {'4', '5', '6'};
	private static char [] row3 = {'7', '8', '9'};
	private static int row = 0;
	private static int column = 0;
	private static char currentPlayer = 'X';
	private static char changePlayer = 'Y';
	private static char continueGame = 'Y';
	static Scanner input = new Scanner (System.in);
	public static char setChangePlayer(){
		changePlayer = 'Y';
		return changePlayer;
	}
	public static int getRow(){
		System.out.println("Enter the row (0, 1, 2) for player " + currentPlayer + ": ");
		row = input.nextInt();
		return row;
	}
	public static int getColumn(){
		System.out.println("Enter the column (0, 1, 2) for player " + currentPlayer + ": ");
		column = input.nextInt();
		return column;
	}
	public static char setLocation(){
		if (row == 0){
			row1 [column] = currentPlayer;
			return row1[column];
		}
		else if (row == 1){
			row2 [column] = currentPlayer;
			return row2[column];
		}
		else if (row ==2){
			row3 [column] = currentPlayer;
			return row3[column];
		}
		else {
			System.out.println("Incorrect Selection, please try again.");
			changePlayer = 'N';
			return changePlayer;
		}
			
	}
	public static void displayGame(){
		System.out.println("--- --- ---");
		System.out.println("|" + row1[0] + "| |" + row1[1] + "| |" + row1[2] + "|");
		System.out.println("--- --- ---");
		System.out.println("|" + row2[0] + "| |" + row2[1] + "| |" + row2[2] + "|");
		System.out.println("--- --- ---");
		System.out.println("|" + row3[0] + "| |" + row3[1] + "| |" + row3[2] + "|");
		System.out.println("--- --- ---");
	}
	public static char changePlayer(){
		if (changePlayer == 'Y'){
			if (currentPlayer == 'X'){
			currentPlayer = 'O';
			return currentPlayer;
			}
			else {
				currentPlayer = 'X';
				return currentPlayer;
			}	
		}
		else
			return changePlayer;
	}
	public static char determineWinner(){
		if (row1[0] == row1[1] && row1[1] == row1[2] && row1[0] != ' '){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row2[0] == row2[1] && row2[1] == row2[2]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row3[0] == row3[1] && row3[1] == row3[2]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row1[0] == row2[0] && row2[0] == row3[0]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row1[1] == row2[1] && row2[1] == row3[1]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row1[2] == row2[2] && row2[2] == row3[2]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row1[0] == row2[1] && row2[1] == row3[2]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else if (row1[2] == row2[1] && row2[1] == row3[0]){
			System.out.println(currentPlayer + " Is the winner!");
			continueGame = 'N';
			return continueGame;
		}
		else{
			continueGame = 'Y';
			return continueGame;
		}
	}
	public static void runGame(){
		while (continueGame == 'Y'){
			setChangePlayer();
			getRow();
			getColumn();
			setLocation();
			displayGame();
			determineWinner();
			changePlayer();
		}
			
	}
	public static void main(String[] args) {
		runGame();
	}

}
