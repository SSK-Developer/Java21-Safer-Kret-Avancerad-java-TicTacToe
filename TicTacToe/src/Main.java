import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static String[][] gameField = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, };
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean c = true;
		while (c) {
			System.out.println("1: för att starta ett spel");
			System.out.println("2: för att avsluta spelet");
			System.out.print("Ange ditt val: ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				playGame();
				break;
			case 2:
				c = false;
				break;
			}
		}
	}

	public static void playGame() {
		clearScreen();
		java.util.Random random = new java.util.Random();
		int tmp = random.nextInt(2) + 1;

		resetGame(); // återställer spelet för att ta bort tidigare markerade rutor med X & O.
		printGameField();
		boolean d = true;
		int player1Count = tmp;
		int player2Count = tmp;
		String player1Character;
		String player2Character;

		while (d) { // Loop som håller igång tills det blir en vinnare eller oavgjort.
			boolean a = true;
			boolean b = true;

			if ((player1Count % 2 == 0) && (player2Count % 2 == 0)) { // conditional statment för att randomisera att X
																		// eller O får börja spelet
				player1Character = "X";
				player2Character = "O";
			} else {
				player1Character = "O";
				player2Character = "X";
			}

			while (a) { // Loop som håller igång tills användaren anger en ruta som är ledig.
				System.out.print("Spelare 1 ange index: ");
				int user1Input = sc.nextInt();

				clearScreen();

				switch (user1Input) { // switch case för att byta ut värdet på de olika
				case 1:
					if (gameField[0][0] != "1") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[0][0] = player1Character;
						a = false;
						break;
					}
				case 2:
					if (gameField[0][1] != "2") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[0][1] = player1Character;
						a = false;
						break;
					}
				case 3:
					if (gameField[0][2] != "3") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[0][2] = player1Character;
						a = false;
						break;
					}
				case 4:
					if (gameField[1][0] != "4") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[1][0] = player1Character;
						a = false;
						break;
					}
				case 5:
					if (gameField[1][1] != "5") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[1][1] = player1Character;
						a = false;
						break;
					}
				case 6:
					if (gameField[1][2] != "6") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[1][2] = player1Character;
						a = false;
						break;
					}
				case 7:
					if (gameField[2][0] != "7") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[2][0] = player1Character;
						a = false;
						break;
					}
				case 8:
					if (gameField[2][1] != "8") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[2][1] = player1Character;
						a = false;
						break;
					}
				case 9:
					if (gameField[2][2] != "9") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[2][2] = player1Character;
						a = false;
						break;
					}
				default:
					System.out.println("Du måste mata in en siffra mellan 1-9");
				}
				printGameField();
			}
			if (printWinnerOrDraw()) {
				d = false;
				break;
			}

			while (b) { // Loop som håller igång tills användaren anger en ruta som är ledig.
				System.out.print("Spelare 2 ange index: ");
				int user2Input = sc.nextInt();
				clearScreen();
				switch (user2Input) {

				case 1:
					if (gameField[0][0] != "1") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[0][0] = player2Character;
						b = false;
						break;
					}
				case 2:
					if (gameField[0][1] != "2") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[0][1] = player2Character;
						b = false;
						break;
					}
				case 3:
					if (gameField[0][2] != "3") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[0][2] = player2Character;
						b = false;
						break;
					}
				case 4:
					if (gameField[1][0] != "4") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[1][0] = player2Character;
						b = false;
						break;
					}
				case 5:
					if (gameField[1][1] != "5") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[1][1] = player2Character;
						b = false;
						break;
					}
				case 6:
					if (gameField[1][2] != "6") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[1][2] = player2Character;
						b = false;
						break;
					}
				case 7:
					if (gameField[2][0] != "7") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[2][0] = player2Character;
						b = false;
						break;
					}
				case 8:
					if (gameField[2][1] != "8") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[2][1] = player2Character;
						b = false;
						break;
					}
				case 9:
					if (gameField[2][2] != "9") {
						System.out.println("Angivna platsen är upptagen!");
						break;
					} else {
						gameField[2][2] = player2Character;
						b = false;
						break;
					}
				default:
					System.out.println("Du måste mata in en siffra mellan 1-9");
				}
				printGameField();
			}
			if (printWinnerOrDraw()) {
				d = false;
				break;
			}
		}
	}

	public static void resetGame() {

		// metod som återställer alla värden på spelplanen och ersätter dem från X & O
		// karaktärer till 1-9.
		gameField[0][0] = "1";
		gameField[0][1] = "2";
		gameField[0][2] = "3";
		gameField[1][0] = "4";
		gameField[1][1] = "5";
		gameField[1][2] = "6";
		gameField[2][0] = "7";
		gameField[2][1] = "8";
		gameField[2][2] = "9";
	}

	public static String checkWinnerOrDraw() {
		// metod som kollar ifall det finns 3 i rad utav X eller O karaktärer i 8
		// möjliga kombinationer och sedan returnerar X, O eller draw beronde på
		// resultat.
		for (int a = 0; a < 8; a++) {
			String line = "";

			switch (a) {
			case 0:
				line = gameField[0][0] + gameField[0][1] + gameField[0][2];
				break;
			case 1:
				line = gameField[1][0] + gameField[1][1] + gameField[1][2];
				break;
			case 2:
				line = gameField[2][0] + gameField[2][1] + gameField[2][2];
				break;
			case 3:
				line = gameField[0][0] + gameField[1][0] + gameField[2][0];
				break;
			case 4:
				line = gameField[0][1] + gameField[1][1] + gameField[2][1];
				break;
			case 5:
				line = gameField[0][2] + gameField[1][2] + gameField[2][2];
				break;
			case 6:
				line = gameField[0][0] + gameField[1][1] + gameField[2][2];
				break;
			case 7:
				line = gameField[0][2] + gameField[1][1] + gameField[2][0];
				break;
			}

			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			} else if (gameField[0][0] != "1" && gameField[0][1] != "2" && gameField[0][2] != "3"
					&& gameField[1][0] != "4" && gameField[1][1] != "5" && gameField[1][2] != "6"
					&& gameField[2][0] != "7" && gameField[2][1] != "8" && gameField[2][2] != "9") {
				return "Draw";
			}
		}
		return " ";
	}

	public static void printGameField() {
		// metod som printar ut spelplanen.
		for (String[] x : gameField) {
			System.out.println(Arrays.toString(x));
		}
	}

	public static boolean printWinnerOrDraw() {
		// metod som kollar om det finns en vinnare och sedan printar ut vinnaren,
		// annars händer inget.
		if (checkWinnerOrDraw().equals("X") || checkWinnerOrDraw().equals("O") || checkWinnerOrDraw().equals("Draw")) {
			if (checkWinnerOrDraw().equals("Draw")) {
				System.out.println("The game is a " + checkWinnerOrDraw());
			} else {
				System.out.println("The winner is player: " + checkWinnerOrDraw());
			}
			return true;
		}
		return false;
	}

	public static void clearScreen() {
		System.out.println(new String(new char[50]).replace("\0", "\r\n"));
	}
}