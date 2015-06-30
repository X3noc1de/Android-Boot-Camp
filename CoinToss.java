import java.util.Random;
import java.util.Scanner;

public class CoinToss {
	public static void main (String[] args) {
		boolean playAgain = true;
		String user_name;
		Scanner user_input = new Scanner(System.in);
		System.out.println("What is your name?");
		user_name = user_input.nextLine();
		System.out.println("Welcome, " + user_name + ".");
		System.out.println("Let's play a game. A coin will be flipped repeatedly.");
		while (playAgain == true) {
			String user_answer;
			Scanner user_input2 = new Scanner(System.in);
			System.out.println("Which do you think will reach 10 flips first, heads or tails?");
			user_answer = user_input2.nextLine();
			while ((!user_answer.equals("heads")) && (!user_answer.equals("tails"))) {
				System.out.println("Sorry, that isnt a side of a coin.");
				String user_tryAgain;
				Scanner user_input3 = new Scanner(System.in);
				System.out.println("You need to pick: heads or tails?");
				user_tryAgain = user_input3.nextLine();
				user_answer = user_tryAgain;
			}
			System.out.println("You think " + user_answer + " will reach 10 first?");
			System.out.println("Well, good luck.");
			System.out.println("Let's begin:");
			int headCount = 0;
			int tailCount = 0;
			String head10 = "false";
			String tail10 = "false";
			int FlipTimes = 1;
			while ((head10 == "false") && (tail10 == "false")) {
				Random coinFlip = new Random();
				int flipResult = coinFlip.nextInt(2);

				FlipTimes++;
				if (flipResult == 1) {
					System.out.println("Heads!");
					headCount = headCount + 1;
					if (headCount == 10) {
						head10 = "true";
						System.out.println("Heads Reached 10 First.");
						System.out.println("Total Heads:" + headCount + " Total Tails:" + tailCount);
						if (user_answer.equals("heads")) {
							System.out.println("Congratulations " + user_name + "! You guessed correctly!");
							String play_again;
							Scanner user_input4 = new Scanner(System.in);
							System.out.println("Want to play again?");
							play_again = user_input4.nextLine();
							while ((!play_again.equals("yes")) && (!play_again.equals("no"))) {
								String user_tryPlayAgain;
								Scanner user_input5 = new Scanner(System.in);
								System.out.println("Please answer yes or no.");
								user_tryPlayAgain = user_input5.nextLine();
								play_again = user_tryPlayAgain;
							}
							if (play_again.equals("false")) {
								playAgain = false;
							}
							else if (play_again.equals("true")) {
								playAgain = true;
							}
						}
						else {
							System.out.println("Sorry " + user_name + "! You were incorrect!");
							String play_again;
							Scanner user_input4 = new Scanner(System.in);
							System.out.println("Do you want to try again?");
							play_again = user_input4.nextLine();
							while ((!play_again.equals("yes")) && (!play_again.equals("no"))) {
								String user_tryPlayAgain;
								Scanner user_input5 = new Scanner(System.in);
								System.out.println("Please answer yes or no.");
								user_tryPlayAgain = user_input5.nextLine();
								play_again = user_tryPlayAgain;
							}
							if (play_again.equals("false")) {
								playAgain = false;
							}
							else if (play_again.equals("true")) {
								playAgain = true;
							}
						}
					}
				}
				else {
					System.out.println("Tails!");
					tailCount = tailCount + 1;
					if (tailCount == 10) {
						tail10 = "true";
						System.out.println("Tails Reached 10 First.");
						System.out.println("Total Heads:" + headCount + " Total Tails:" + tailCount);
						if (user_answer.equals("tails")) {
							System.out.println("Congratulations " + user_name + "! You guessed correctly!");
							String play_again;
							Scanner user_input4 = new Scanner(System.in);
							System.out.println("Want to play again?");
							play_again = user_input4.nextLine();
							while ((!play_again.equals("yes")) && (!play_again.equals("no"))) {
								String user_tryPlayAgain;
								Scanner user_input5 = new Scanner(System.in);
								System.out.println("Please answer yes or no.");
								user_tryPlayAgain = user_input5.nextLine();
								play_again = user_tryPlayAgain;
							}
							if (play_again.equals("no")) {
								playAgain = true;
							}
							else {
								playAgain = false;
							}
						}
						else {
							System.out.println("Sorry " + user_name + "! You were incorrect!");
							String play_again;
							Scanner user_input4 = new Scanner(System.in);
							System.out.println("Do you want to try again?");
							play_again = user_input4.nextLine();
							while ((!play_again.equals("yes")) && (!play_again.equals("no"))) {
								String user_tryPlayAgain;
								Scanner user_input5 = new Scanner(System.in);
								System.out.println("Please answer yes or no.");
								user_tryPlayAgain = user_input5.nextLine();
								play_again = user_tryPlayAgain;
							}
							if (play_again.equals("no")) {
								playAgain = true;
							}
							else {
								playAgain = false;
							}
						}
					}
				}
			}
		}
	}
}