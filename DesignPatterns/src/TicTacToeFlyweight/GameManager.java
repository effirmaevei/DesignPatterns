package TicTacToeFlyweight;
import java.util.Scanner;

/**
 * Do not want more than one GameManager. Uses 
 * lazy initialization.
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class GameManager {

	private static int currentRound = 0;
	private static int choosenGridPosition = -1;
	private static Scanner sc = new Scanner(System.in);
	
	private static String[] board = {" "," "," "," "," "," "," "," "," "};
	
	private static String boardLine = "\n ____|_____|____ \n";
	private static String border = "  |  ";
	private static boolean noWinner = true;
	
	private static Flyweight[] flyWList = {IconifiedO.getFlyweight(), IconifiedX.getFlyweight()};
	
	private GameManager() {	};
	
	public static void startGame(){		
		displayBoardPositionsFirstTime();
		while(noWinner){
			playRound();
		}		
		System.out.println("PLAYER " + ((currentRound-1)%2+1) + " WINS! ->GAME OVER<-");
	}
	
	/** 
	 * Triggers a change in the map array. A player adds a mark	
	 */
	private static void playRound(){
			
		System.out.print("Player " + (currentRound%2+1) + ". Choose a position from 0 to 8. ");
		
		getInput();
				
		if(currentRound%2==0){
			board[choosenGridPosition] = flyWList[0].getVisualData();					
		}else{
			board[choosenGridPosition] = flyWList[1].getVisualData();
		}
		
		displayBoard();
		
		if(currentRound>2) checkForWin();
		currentRound++;
	};
	
	
	
	
	private static void getInput(){
		
		try{
			choosenGridPosition = sc.nextInt();
			if(board[choosenGridPosition]!=" "){
				System.out.print("\nPosition taken. Choose a different position.");				
				getInput();
			}
				
		}catch(Exception e){
			System.out.print("\nPlease input a valid position.    ");
			sc.next();
			getInput();
		}
	}
	
	private static void displayBoardPositionsFirstTime(){

		String map = " 0  | 1 | 2  \n"
				  +  " ___|___|___ \n"
				  +  " 3  | 4 | 5  \n"
			      +  " ___|___|___ \n"
		  	      +  " 6  | 7 | 8  \n"
				  +  "    |   |    \n";
		
		System.out.println(map);
	}
	
	private static void displayBoard(){		

		StringBuilder sb = new StringBuilder();
		
		sb.append("\n  ").append(board[0]).append(border).append(board[1]).append(border).append(board[2])
		  .append(boardLine)
		  .append("  ").append(board[3]).append(border).append(board[4]).append(border).append(board[5])
		  .append(boardLine)
		  .append("  ").append(board[6]).append(border).append(board[7]).append(border).append(board[8])
		  .append("\n     |     |     \n");
		
		System.out.println(sb);							

	}
	
	private static void checkForWin(){
		if(board[0] != " "){
			if(board[0] == board[1] & board[0] == board[2]) noWinner = false;
			if(board[0] == board [3] & board[0] == board[6]) noWinner = false;		
			if(board[0] == board [4] & board[0] == board[8] & board[0]!=" ") noWinner = false;	
		}
		if(board[3] == board [4] & board[3] == board[5] & board[3]!=" ") noWinner = false;		
		if(board[6] == board [7] & board[6] == board[8] & board[6]!=" ") noWinner = false;		
		if(board[1] == board [4] & board[1] == board[7] & board[1]!=" ") noWinner = false;		
		if(board[2] == board [5] & board[2] == board[8] & board[2]!=" ") noWinner = false;		
		if(board[2] == board [4] & board[2] == board[6] & board[2]!=" ") noWinner = false;
	}
	
}
