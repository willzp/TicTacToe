package tictac;

import java.util.Scanner;

public class demo {

	String one = " ";
	String two = " ";
	String three = " ";
	String twoOne = " ";
	String twoTwo = " ";
	String twoThree = " ";
	String threeOne = " ";
	String threeTwo = " ";
	String threeThree = " ";
	String line = " -----";
	String playerTurn = "x";

	public void ClearScore() {
		one = " ";
		two = " ";
		three = " ";
		twoOne = " ";
		twoTwo = " ";
		twoThree = " ";
		threeOne = " ";
		threeTwo = " ";
		threeThree = " ";
	}

	public void ChangePlayer() {
		if (playerTurn.equals("x")) {
			playerTurn = "o";
		} else {
			playerTurn = "x";
		}

	}

	public void WhoWon() {

		if (one.equals("x") && two.equals("x") && three.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (twoOne.equals("x") && twoTwo.equals("x") && twoThree.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (threeOne.equals("x") && threeTwo.equals("x") && threeThree.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (one.equals("o") && two.equals("o") && three.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (twoOne.equals("o") && twoTwo.equals("o") && twoThree.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (threeOne.equals("o") && threeTwo.equals("o") && threeThree.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (one.equals("x") && twoOne.equals("x") && threeOne.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (two.equals("x") && twoTwo.equals("x") && threeTwo.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (three.equals("x") && twoThree.equals("x") && threeThree.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (one.equals("o") && twoOne.equals("o") && threeOne.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (two.equals("o") && twoTwo.equals("o") && threeTwo.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (three.equals("o") && twoThree.equals("o") && threeThree.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (one.equals("o") && twoTwo.equals("o") && threeThree.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (one.equals("x") && twoTwo.equals("x") && threeThree.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (three.equals("o") && twoTwo.equals("o") && threeOne.equals("o")) {
			System.out.println(" O WON!\n To play agin");
			ClearScore();
		}
		if (three.equals("x") && twoTwo.equals("x") && threeOne.equals("x")) {
			System.out.println(" X WON!\n To play agin");
			ClearScore();
		}
		if (!one.equals(" ") && !two.equals(" ") && !three.equals(" ") && !twoOne.equals(" ") && !twoTwo.equals(" ")
				&& !twoThree.equals(" ") && !threeOne.equals(" ") && !threeTwo.equals(" ") && !threeThree.equals(" ")) {
			System.out.println(" IT'S A DRAW!\n To play agin");
			ClearScore();
		}

	}

	public void Play() {
		while (true) {

			System.out.println(" choose spot for " + playerTurn + "");
			Scanner input = new Scanner(System.in);

			String svar = input.nextLine();
			if (svar.equals("a1")) {
				one = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("a2")) {
				two = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("a3")) {
				three = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("b1")) {
				twoOne = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("b2")) {
				twoTwo = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("b3")) {
				twoThree = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("c1")) {
				threeOne = playerTurn;
				ChangePlayer();
			}
			if (svar.equals("c2")) {
				threeTwo = playerTurn;
				ChangePlayer();

			}
			if (svar.equals("c3")) {
				threeThree = playerTurn;
				ChangePlayer();
			}
			if (!svar.equals("a1") && !svar.equals("a2") && !svar.equals("a3") && !svar.equals("b1")
					&& !svar.equals("b2") && !svar.equals("b3") && !svar.equals("c1") && !svar.equals("c2")
					&& !svar.equals("c3")) {

				System.out.println("Enter correct spot!");

			}
			PrintBoard();
			WhoWon();

		}
	}

	public void PrintBoard() {
		System.out.println(" a |" + one + "|" + two + "|" + three + "|\n b |" + twoOne + "|" + twoTwo + "|" + twoThree
				+ "|\n c |" + threeOne + "|" + threeTwo + "|" + threeThree + "|\n    1  2  3\n -----------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n tic tac toe\n \n a |__|__|__|\n b |__|__|__|\n c |__|__|__|\n    1  2  3\n -------------");

		demo d = new demo();
		d.Play();
	}

}
