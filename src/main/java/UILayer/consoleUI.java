package UILayer;

import businessLayer.*;
import entityClasses.*;
import java.util.*;
import java.io.*;

/**
 * This is an UI class, representing the game being played.
 */

public class consoleUI 
{
	private static GameController game;

	public static void main(String args[])
	{
		Scanner scanIn = new Scanner(System.in);

		System.out.println("Welcome to the game TicTacToe!");

		System.out.println("What is name of player X: ");
		String nameX = scanIn.nextLine();
		System.out.println("What is name of player O: ");
		String nameO = scanIn.nextLine();
		game = new GameController(nameX, nameO);
		
		Boolean continueGame = true;
		do{

			printBoard();

			System.out.println("Let's start the game!");

			Boolean stopGame = false;
			int moveX, moveY;

			while(stopGame == false)
			{
				System.out.println("Make your move " + game.getCurrentPlayer().getName());
				boolean moveMade = false;
				do 
				{
					System.out.println("Write first the x position (0/1/2): ");
					moveX = scanIn.nextInt();
				    System.out.println("Now write the y position (0/1/2): ");
					moveY = scanIn.nextInt();
					scanIn.nextLine();

					moveMade = game.makeMove(moveX, moveY);
					if(!moveMade)
					{
						System.out.println("Illegal move");
					}
				} while(!moveMade);
				
				printBoard();
				
				int status = game.checkStatus();
				
				if(status == 1)
				{
					System.out.println(game.getCurrentPlayer().getName() + " is the winner!");				
					stopGame = true;
				}
				else if(status == 2)
				{
					System.out.println("It's a draw!");
					stopGame = true;
				}
				else if(status == 0)
				{
					game.switchPlayer();
				}
				
			}
			
			System.out.println("Status of wins for " + game.getPlayerX().getName() + ": " + game.getPlayerX().getWins());
			System.out.println("Status of wins for " + game.getPlayerO().getName() + ": " + game.getPlayerO().getWins());

			System.out.println("Do you want to continue playing TicTacToe? Y/N ");
			char c = scanIn.next().charAt(0);
			if(c == 'Y' || c == 'y')
			{
				game.clearBoard(); //clears board for another game

			}
			else
			{
				System.out.println("Thank you for playing the TicTacToe game!");
				continueGame = false;
			}
		}while(continueGame == true);
		scanIn.close();		
	}

	/**
	 * Displays the board for players.
	 */
	private static void printBoard() 
	{
		char[][] board = game.getBoard();

		System.out.println("     |     |     ");
		System.out.println("  " + board[0][0] + "  | " + board[0][1] + "   | " + board[0][2]);
		System.out.println("     |     |     ");
		System.out.println("-----+-----+-----");
		System.out.println("     |     |     ");
		System.out.println("  " + board[1][0] + "  | " + board[1][1] + "   | " + board[1][2]);
		System.out.println("     |     |     ");
		System.out.println("-----+-----+-----");
		System.out.println("     |     |     ");
		System.out.println("  " + board[2][0] + "  | " + board[2][1] + "   | " + board[2][2]);
		System.out.println("     |     |     ");
		
	}
}