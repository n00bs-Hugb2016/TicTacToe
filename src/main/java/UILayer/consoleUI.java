package UILayer;

import businessLayer.*;
import entityClasses.*;
import java.util.*;
import java.io.*;
//import java.util.Scanner;


public class consoleUI 
{
	public static void main(String args[])
	{
		GameController game = new GameController();
		Scanner scanIn = new Scanner(System.in);

		//Console console = System.console();

		System.out.println("Welcome to the game TicTacToe!");
		
		System.out.println("What is name of player X: ");
		String nameX = scanIn.nextLine();
		
		//game.getPlayer('X').name = nameX;
		System.out.println("What is name of player O: ");
		String nameO = scanIn.nextLine();
		//game.getPlayer('O').name = nameO;
		
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
			stopGame = true;
		}
		scanIn.close();


		
	}
}