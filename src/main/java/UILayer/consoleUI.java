package UILayer;

import businessLayer.*;
import entityClasses.*;
import java.util.*;
import java.io.*;


public class consoleUI {

	public static void main(String args[])
	{
		System.out.println("What is name of player X: ");
		//String nameX = System.readLine();
		System.out.println("What is name of player O: ");
		//String nameO = System.readLine();
		Player playerX = new Player('X');
		Player playerO = new Player('O');

		System.out.println("Welcome to TicTacToe!");
		
	}
}