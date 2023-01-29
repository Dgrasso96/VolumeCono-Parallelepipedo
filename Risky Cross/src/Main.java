import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int value, n;
		boolean exit = false;
		String fuck;
		char HorT;

		while (!exit) {

			printMenu();
			value = in.nextInt();

			switch (value) {

			case 1:

				System.out.println("How many dice would you like to roll? (max 6)");
				n = in.nextInt();

				if (n > 6 || n < 1) {
					System.out.println("Are you fucking kidding me?");
					break;
				}

				Dice dice = new Dice(n);

				dice.launch();
				System.out.println(dice.getX());
				break;

			case 2:

				System.out.println("Heads or Tails?");
				System.out.println("Heads = h	Tails=t");
				fuck = in.next();
				HorT = fuck.charAt(0);

				if (HorT != 'h' && HorT != 't') {
					System.out.println("Are you fucking kidding me?");
					break;
				}

				Coin coin = new Coin();

				coin.launch();

				if (coin.getX() == 1) {
					System.out.println("Heads");
				} else {
					System.out.println("Tails");
				}

				break;

			case 7:

				Donut donut = new Donut();

				System.out.println(donut.toString());
				break;

			case 9:
				exit = true;
				break;

			default:
				System.out.println("Invalid value!");
				break;
			}
		}

		in.close();

	}

	public static void printMenu() {

		System.out.println("\nxxxxxxx RISKY CROSS xxxxxxx");
		System.out.println("\n1.Dice\n2.Heads or Tails\n7.Don't easter egg\n9.Exit\n");
	}

}
