

public class Calculator {
	
	private String problem;
	private String [] part;
	private double result;
	private String [] piece1;
	private String [] piece2;
	
	public void getInput(){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter your problem: ");
		problem = input.nextLine();
		input.close();
	}
	public void splitString(){
		part = problem.split("\\s");
		piece1 = part[0].split("/");
		piece2 = part[2].split("/");
	}
	public double calculate(){	
		switch (part[1]){
		case "+": result = ((Integer.parseInt(piece1[0]) / Integer.parseInt(piece1[1])) * Integer.parseInt(piece2[1])) 
				+ ((Integer.parseInt(piece2[0]) / Integer.parseInt(piece2[1])) * Integer.parseInt(piece1[1]));
			break;
		case "-": result = ((Integer.parseInt(piece1[0]) / Integer.parseInt(piece1[1])) * Integer.parseInt(piece2[1])) 
				- ((Integer.parseInt(piece2[0]) / Integer.parseInt(piece2[1])) * Integer.parseInt(piece1[1]));
			break;
		case "*": result = ((Integer.parseInt(piece1[0]) / Integer.parseInt(piece1[1])) * Integer.parseInt(piece2[1])) 
				* ((Integer.parseInt(piece2[0]) / Integer.parseInt(piece2[1])) * Integer.parseInt(piece1[1]));
			break;
		case "/": result = ((Integer.parseInt(piece1[0]) / Integer.parseInt(piece1[1])) * Integer.parseInt(piece2[1])) 
				/ ((Integer.parseInt(piece2[0]) / Integer.parseInt(piece2[1])) * Integer.parseInt(piece1[1]));
			break;
		}
		return result;
	}
	public void displayAnswer(){
		System.out.println(part[0] + " " + part[1] + " " + part[2] + " = " + result); 
	}
	public static void main (String [] args){
		Calculator calc1 = new Calculator();
		calc1.getInput();
		//System.out.println(calc1.problem);
		calc1.splitString();
		//for (String w: calc1.part1){System.out.println(w);}
		calc1.calculate();
		calc1.displayAnswer();
		//System.out.println(calc1.piece1[0] + " " + calc1.piece1[1]);
		//Not in working order
	}
}
