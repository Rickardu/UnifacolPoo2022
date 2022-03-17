package basico;

import java.util.Scanner;

public class JavaSwitchBomdia {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int hora=-1;
		do {
			System.out.println("DIGITE A HORA:");
			hora = sc1.nextInt();

			switch (hora) {
			case 0,1, 2, 3, 4, 5,6, 8,9,10,11:
				System.out.printf("São %d hora(s)\n", hora);
				System.out.println("BOM DIA !!");
				break;
			case 12:
				System.out.println("passando no 12");
			case 13:
				System.out.println("passando no 13");
			case 14:
				System.out.println("passando no 14");
			case 15:
				System.out.println("passando no 15");
			case 16:
				System.out.println("passando no 16");
			case 17:
				System.out.println("passando no 17");
				System.out.printf("São %d hora(s)\n", hora);
				System.out.println("BOA TARDE !!");
				break;
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
				System.out.printf("São %d hora(s)\n", hora);
				System.out.println("BOA NOITE !!");

				break;
			default:
				System.out.println("Hora inválida!!!"); 
			}
		} while (hora >= 0 && hora <= 23);
	}

}
