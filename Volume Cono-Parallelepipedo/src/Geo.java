import java.util.Scanner;

public class Geo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int value;
		double s, h;
		boolean exit = false;

		while (!exit) {

			printMenu();

			value = in.nextInt();

			switch (value) {
			case 1:
				System.out.println("Inserisci raggio:");
				s = in.nextDouble();
				System.out.println("Inserisci altezza:");
				h = in.nextDouble();

				Cono c = new Cono(s);

				System.out.println("Volume del cono: " + c.volume(h));

				break;

			case 2:
				System.out.println("Inserisci lato del quadrato di base:");
				s = in.nextDouble();
				System.out.println("Inserisci altezza:");
				h = in.nextDouble();

				Parallelepipedo p = new Parallelepipedo(s);

				System.out.println("Volume del parallelepipedo: " + p.volume(h));

				break;

			case 3:
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
		System.out.println("\n******* CALCOLO VOLUME CONO - PARALLELEPIPEDO *******");
		System.out.println("1. Cono\n2. Parallelepipedo\n3.Uscita\n");
	}

}
