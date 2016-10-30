package UILayer;

import businessLayer.*;
import entityClasses.*;
import java.util.*;
import java.io.*;
//import java.util.Scanner;


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

		printBoard();

		System.out.println("Let's start the game!");

		Boolean stopGame = false;
		int moveX;
		int moveY;

		while(stopGame == false)
		{
			System.out.println("Make your move " + game.getCurrentPlayer().getName());
			System.out.println("Write first the x position: ");
			moveX = scanIn.nextInt();
		    System.out.println("Now write the y position: ");
			moveY = scanIn.nextInt();
			game.makeMove(moveX, moveY);
			stopGame = true;
		}
		scanIn.close();
		
	}



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