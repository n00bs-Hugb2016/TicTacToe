#Development manual for TicTacToe
### All new employees should read this

Everyone should clone into the repository with the `git clone` command. [Click here](https://github.com/n00bs-Hugb2016/TicTacToe.git) for the repository link.

## Introduction
This n00bs project is the making of the popular game of Tic Tac Toe. If you are not familiar with Tic Tac Toe, you can find the rules of the game [here](https://en.wikipedia.org/wiki/Tic-tac-toe). 

## What do you need for the project?
* GitHub account.
	* You need to be a member of the n00bs-Hugb2016 organization.
* Java 1.8.0_101 or newer (the version can be found with the command `java -version`).
	* Can be installed here: [Click me!]( http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
* Git Bash installed.
* Account at Advania's Qstack (received from project manager).


## Coding rules
1. Naming
	* Naming functions:
		* Names of functions should be written in *camelCasing*.
			* Example: startGame();
		* Names of functions should be verbs.
	* Naming variables; private and public:
		* *Private* variables should have underscore in front and be written in *camelCasing*
			* Example: var _humanPlayer;
		* *Public* variables should be written in *camelCasing*
			* Example: var computerPlayer;
	* Naming classes:
		* Should be nouns, in singular.
		* Should be describing for their content.
		* Should be written in *PascalCasing*
			* Example: GameController
2. Code architecture
	* Declarations:
		* Only one declaration should be in each line of code.
			* Example:  var player;
			* Example: var winner = getWinner();
	* Declarations of variables:
		* Should be in the beginning of each function.
		* Arranged by type first, then alphabetically.
			* Example: <br/>
				private getWinner() <br/>
				{ <br/>
					int numOfWins = 0; <br/>
					string player1Name = "Bob"; <br/>
					string player2Name = "Grub"; <br/>
				}
	* Brackets
		* Brackets are always used after a conditional statement, even though it is only around one expression, to maintain readability.
			* Example: <br/>
				if (*condition*) <br/>
				{ <br/>
					foo(); <br/>
				}
	* Indentation
		* Code should be indented with eight character spacings which equals the push of the "tabs" button.
	* Commentation
		* When writing a long comment, use the multiline commentation according to Java rules. This should always be done above the subject being commented on.
			* Example: <br/>
				/* comment <br/>
				that <br/>
				is <br/>
				very <br/>
				long */ <br/>
				getWinner() <br/>
				{ <br/>
					code; <br/>
				}
		* When commenting a single line comment, use the single line commentation according to Java Rules. This should always be done above the subject being commented on.
			* Example:<br/>
				// comment <br/>
				getWinner() <br/>
				{ <br/>
					code; <br/>
				}
	* Character spacing
		* Between a condition and a opening parenthesis there should be one space.
		* Between the parenthesis and the condition, there should be no space.
		* One space should separate classes and variables from operators, unary operators excluded.
			* Example:<br/>
				a = b + c; <br/>
				a++; <br/>
	* Line spacing
		* One empty line should separate the definitions of two functions.
		* One empty line should separate the final variable declaration from the rest of the function's code.
		* Two empty lines should separate the definitions of classes.
3. Cooperative Control
	* Coordination of code
		* Consult the rest of the programming team before starting to change a file.
