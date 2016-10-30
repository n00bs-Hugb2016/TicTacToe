package UILayer;

import businessLayer.*;
import entityClasses.*;
import java.util.*;
import java.io.*;


public class consoleUI {

	public static void main(String args[])
	{
		GameController game = new GameController();
		
		//Console console = System.console();

		System.out.println("Welcome to the game TicTacToe!");
		
		System.out.println("What is name of player X: ");
		//String nameX = System.readLine();
		//game.getPlayer('X').name = nameX;
		System.out.println("What is name of player O: ");
		//String nameO = System.readLine();
		//game.getPlayer('O').name = nameO;
		
		System.out.println("Let's start the game!");

		Boolean stopGame = false;
		
		while(stopGame == false)
		{
			System.out.println("Write first x position then y position");
			//System.out.println("Make your move " + game.getWhoStarts().getName());

		}


		
	}
}