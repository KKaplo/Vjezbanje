package kapl;

import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz=new Scanner(System.in);

	public static int unosBrojRaspon(String poruka, int min, int max) {
		int i;
		while (true) {
			try {
				System.out.println(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if (i < min || i > max) {
					System.out.println("Broj mora biti između " + min + " i " + max);
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli broj");
			}
		}

	}

	public static void CLS() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	public static String unosTeksta(String poruka) {
		String s;
		while (true) {
			System.out.println(poruka);
			s = ulaz.nextLine();
			if (s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}
	}

	public static String unosDobreKolone() {
		String str;
		while (true) {
			System.out.println("Unesi zeljenu kolonu(D/G/S/N/R): ");
			str = ulaz.nextLine();
			if (str.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			if ((str.equals("D")) || str.equals("G") || str.equals("S") || str.equals("N") || str.equals("R") ) {
				
				return str;
			}
			System.out.println("-----------------------------------");
			System.out.println("Ulaz je u krivome formatu\nUnos mora biti tipa (G/D/S/N/R) ");
			System.out.println("-----------------------------------");

		}
	}

	public static String unosDobrogRetka() {
		String str;
		while (true) {
			System.out.println("Unesi zeljenu redak(1/2/3/4/5/6/MAX/MIN/2P/SK/FUL/POK/JAM): ");
			str = ulaz.nextLine();
			if (str.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			if ((str.equals("1")) || (str.equals("2")) || (str.equals("3")) || (str.equals("4")) || (str.equals("5")) || (str.equals("6"))
					 || (str.equals("MAX")) || (str.equals("MIN"))
					 || (str.equals("2P")) || (str.equals("SK")) || (str.equals("FULL")) || (str.equals("POK")) || (str.equals("JAM"))) {

				return str;
			}
			System.out.println("-----------------------------------");
			System.out.println("Ulaz je u krivome formatu\nUnos mora biti (1/2/3/4/5/6/MAX/MIN/2P/SK/FUL/POK/JAM) ");
			System.out.println("-----------------------------------");
			
		}

	}

	public static String unosVrijednosti() {
		String str;
		int vrijednost;
		while (true) {
			System.out.println("Unesi vrijednost ili X za krizanje polja: ");
			str = ulaz.nextLine();
			if (str.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			try {
				   vrijednost = Integer.parseInt(str);
				}
				catch (NumberFormatException e) {
					vrijednost=-1;
				}
			if ((str.equals("X")) || (vrijednost>=0 && vrijednost<=80) ) {

				return str;
			}
			
				
			System.out.println("-----------------------------------");
			System.out.println("Ulaz je u krivome formatu\nUnos mora biti (X ili vrijednost između 0 i 80) ");
			System.out.println("-----------------------------------");
			
		}
	}

}
