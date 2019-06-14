package FridayTestTask1.FTT1;
import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
    	boolean game = true;
    	boolean start = true;
    	String[] MapLine1 = {"E","A","E","E","D","E","C","E"};
    	String[] MapLine2 = {"E","E","X","E","A","B","E","D"};
    	String[] MapLine3 = {"B","E","D","E","C","D","E","E"};
    	String[] MapLine4 = {"E","C","E","D","B","E","O","A"};
    	String[] MapLine5 = {"E","E","E","A","E","E","E","C"};
    	String[] MapLine6 = {"C","E","E","E","D","E","B","E"};
    	String[][] Map = {MapLine1,MapLine2,MapLine3,MapLine4,MapLine5,MapLine6};
    	int[] goal = {1,2};
    	int[] Location = {3,6};
    	int XfromGoal = 0;
    	int YfromGoal = 0;
    	int distfromGoal = 0;
    	String[] LineToUse = new String[8];
    	Scanner input = new Scanner(System.in); 
    	String command = "";
    	
    	while (game) {
    		if (start) {
    			System.out.println("You awaken, alone, in the middle of a seemingly endless expance of sand.");
    			System.out.print("Try Entering 'look': >");
    			command =input.nextLine();
    			if (command.equals("look")) {
    				start = false;
    			}
    		}
    		else {
	    		LineToUse = Map[Location[0]];
	    		
	    		if (LineToUse[Location[1]].equals("O")) {
	    			System.out.println("A glint in the sand nearby catches your eye.");
	    			System.out.println("Walking over, you see that the glint is a metal compass, reflecting the");
	    			System.out.println("suns rays. The directions 'north', 'east', 'south' and 'west' are engraved");
	    			System.out.print("upon it. >");
	    			command =input.nextLine();
	    		}
	    		
	    		if (LineToUse[Location[1]].equals("E")) {
	    			System.out.println("The desert stretches onwards... >");
	    			command =input.nextLine();
	    		}
	    		
	    		if (LineToUse[Location[1]].equals("D")) {
	    			System.out.println("The relentless heat continues as you scale yet another sandbar. >");
	    			command =input.nextLine();
	    		}
	    		
	    		if (LineToUse[Location[1]].equals("C")) {
	    			System.out.println("You think you see an oasis in the distance, but your hopes are");
	    			System.out.println("swiftly dashed when you realise it is just a mirage. >");
	    			command =input.nextLine();
	    		}
	    		
	    		if (LineToUse[Location[1]].equals("B")) {
	    			System.out.println("A group of cacti break up the endless orange. If only you");
	    			System.out.println("had watched more survival documentaries, you might have");
	    			System.out.println("been able to get some water out of them. >");
	    			command =input.nextLine();
	    		}
	    		
	    		if (LineToUse[Location[1]].equals("A")) {
	    			System.out.println("A vulture is purched on a lone palm tree up ahead. You");
	    			System.out.println("decide it is probably best not to get too close. >");
	    			command =input.nextLine();
	    		}
	    		
	    		if (LineToUse[Location[1]].equals("X")) {
	    			System.out.println("As you reach the top of the next dune, you are relieved to see a");
	    			System.out.println("small collection of tents in the distance. You are saved!");
	    			break;
	    		}
	    			
	    		if (command.equals("north")) {
	    			if (Location[0] == 0){
	    				System.out.println("The compass begins spinning wildly. Maybe it's best not to head this way.");
	    			}
	    			else {
	    				Location[0] = Location[0] - 1;
	    			}
	    		}
	    		if (command.equals("south")) {
	    			if (Location[0] == 5){
	    				System.out.println("The compass begins spinning wildly. Maybe it's best not to head this way.");
	    			}
	    			else {
	    				Location[0] = Location[0] + 1;
	    			}
	    		}
	    		if (command.equals("west")) {
	    			if (Location[1] == 0){
	    				System.out.println("The compass begins spinning wildly. Maybe it's best not to head this way.");
	    			}
	    			else {
	    				Location[1] = Location[1] - 1;
	    			}
	    		}
	    		if (command.equals("east")) {
	    			if (Location[1] == 7){
	    				System.out.println("The compass begins spinning wildly. Maybe it's best not to head this way.");
	    			}
	    			else {
	    				Location[1] = Location[1] + 1;
	    			}
	    		}
	    		
	    		XfromGoal = goal[0] - Location[0];
	    		YfromGoal = goal[1] - Location[1];
	    		if (Integer.signum(XfromGoal) == -1) {
	    			XfromGoal = -XfromGoal;
	    		}
	    		if (Integer.signum(YfromGoal) == -1) {
	    			YfromGoal = -YfromGoal;
	    		}
	    		distfromGoal = (XfromGoal * XfromGoal) + (YfromGoal * YfromGoal);
	    		System.out.println("The compass shakes in your palm. You are " + Integer.toString(distfromGoal) + 
	    				"km away from safety.");	
    		}
    	}   	
        System.out.println( "Congratulations, you have won!" );
        input.close();
    }
}
