import java.util.Random;

public class PlayerManager 
{
	static String [] availablePlayers = new String [39];
	static String [] pPosition = new String [39];
	static int num1 = 0;
	static int num2 = 0;
	static int switchNum = 0;
	static String position = " ";
	static String name = " ";
	static String fName = " ";
	static String lName = " ";
	
	public static String determinePosition()
	{
		if (num1 <= 2)
			position = "Center";
		else if (num1 <= 5)
			position = "Offensive Guard";
		else if (num1 <= 8)
			position = "Offensive Tackle";
		else if (num1 <= 11)
			position = "Quarterback";
		else if (num1 <= 14)
			position = "Running Back";
		else if (num1 <= 17)
			position = "Wide Reciever";
		else if (num1 <= 20)
			position = "Tight End";
		else if (num1 <= 23)
			position = "Defensive Tackle";
		else if (num1 <= 26)
			position = "Defensive End";
		else if (num1 <= 29)
			position = "Middle Linebacker";
		else if (num1 <= 32)
			position = "Outside Linebacker";
		else if (num1 <= 35)
			position = "Cornerback";
		else if (num1 <= 38)
			position = "Safety";
		return position;
	}
	
	public static String firstName ()
	{
		switch (switchNum)
		{
			case 1: fName = "Bob";
					break;
			case 2: fName = "Billy";
					break;
			case 3: fName = "Joe";
					break;
			case 4: fName = "Kris";
					break;
			case 5: fName = "Devonte";
					break;
			case 6: fName = "Crees";
					break;
			case 7: fName = "Rurik";
					break;
			case 8: fName = "Clyde";
					break;
			case 9: fName = "Jekyl";
					break;
		}
		return fName;
	}
	
	public static String lastName ()
	{
		switch (switchNum)
		{
			case 1: lName = "Crimson";
					break;
			case 2: lName = "Kogwell";
					break;
			case 3: lName = "Sullivan";
					break;
			case 4: lName = "Demeter";
					break;
			case 5: lName = "Paas";
					break;
			case 6: lName = "Kif";
					break;
			case 7: lName = "Gulu";
					break;
			case 8: lName = "Tron";
					break;
			case 9: lName = "Sif";
					break;
		}
		return lName;
	}
	
	public static void CreatePlayers()
	{
		
		while (num1 <= availablePlayers.length - 1)
		{
			Random r1 = new Random ();
			switchNum = r1.nextInt(9) + 1;
			firstName();
			switchNum = r1.nextInt(9) + 1;
			lastName();
			name = fName + " " + lName;
			determinePosition();
			NFLPlayer player = new NFLPlayer(name, position);
			availablePlayers[num2] = player.playerName;
			pPosition[num2] = player.playerPosition;
			//System.out.println("Player: " + availablePlayers[num2] + " Position: " + pPosition[num2]);
			num1++;
			num2++;
		}
	}
	/*
	public static void main (String [] args)
	{
		CreatePlayers();
	}
	*/
}
