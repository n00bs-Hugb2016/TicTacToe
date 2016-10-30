package UILayer;

import businessLayer.*;
import entityClasses.*;
import java.util.*;
import java.io.*;



public class consoleUI 
{
	public static void main(String args[])
	{
		Scanner scanIn = new Scanner(System.in);
		//Scanner scanOut = new Scanner(System.out);

		System.out.println("Welcome to the game TicTacToe!");
		
		System.out.print("What is name of player X: ");
		String nameX = scanIn.nextLine();

		System.out.print("What is name of player O: ");
		String nameO = scanIn.nextLine();
		
		GameController game = new GameController(nameX, nameO);

		System.out.println("Let's start the game!");

		Boolean stopGame = false;
		int move;
		String bla;
		while(stopGame == false)
		{
			System.out.println("Write first x position then y position");
			//System.out.println("Make your move " + game.getWhoStarts().getName());
			System.out.println("Make your move ");
			move = scanIn.nextInt();
			scanIn.nextLine();
			stopGame = true;
		}
		scanIn.close();
		
	}
}