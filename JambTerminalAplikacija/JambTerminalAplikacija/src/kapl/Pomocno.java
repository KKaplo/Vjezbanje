package kapl;

import java.util.ArrayList;
import java.util.Scanner;

import kapl.model.Igra;

public class Pomocno {

	public static Scanner ulaz = new Scanner(System.in);

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
			if ((str.equalsIgnoreCase("D")) || str.equalsIgnoreCase("G") || str.equalsIgnoreCase("S")
					|| str.equalsIgnoreCase("N") || str.equalsIgnoreCase("R")) {

				return str.toUpperCase();
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
			if ((str.equalsIgnoreCase("1")) || (str.equalsIgnoreCase("2")) || (str.equalsIgnoreCase("3"))
					|| (str.equalsIgnoreCase("4")) || (str.equalsIgnoreCase("5")) || (str.equalsIgnoreCase("6"))
					|| (str.equalsIgnoreCase("MAX")) || (str.equalsIgnoreCase("MIN")) || (str.equalsIgnoreCase("2P"))
					|| (str.equalsIgnoreCase("SK")) || (str.equalsIgnoreCase("FUL")) || (str.equalsIgnoreCase("POK"))
					|| (str.equalsIgnoreCase("JAM"))) {

				return str.toUpperCase();
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
			} catch (NumberFormatException e) {
				vrijednost = -1;
			}
			if ((str.equals("X")) || (vrijednost >= 0 && vrijednost <= 80)) {

				return str;
			}

			System.out.println("-----------------------------------");
			System.out.println("Ulaz je u krivome formatu\nUnos mora biti (X ili vrijednost između 0 i 80) ");
			System.out.println("-----------------------------------");

		}
	}

	public static void racunanjeZbrojaKolone(ArrayList<String> kolona) {
		int priv = 0;
		for (int i = 0; i < 6; i++) {
			priv += provjeriJeliBroj(kolona.get(i));
		}
		kolona.set(6, Integer.toString(priv));

		// RACUNAJE MAX-MIN * broj jedinica
		int max = provjeriJeliBroj(kolona.get(7));
		int min = provjeriJeliBroj(kolona.get(8));
		int jedinice = provjeriJeliBroj(kolona.get(0));

		if (max > 0 && min > 0 && jedinice >= 0) {
			kolona.set(9, Integer.toString((max - min) * jedinice));
		} else {
			kolona.set(9, Integer.toString(0));
		}
		priv = 0;
		for (int i = 10; i < 15; i++) {
			priv += provjeriJeliBroj(kolona.get(i));
		}
		kolona.set(15, Integer.toString(priv));
	}

	private static int provjeriJeliBroj(String string) {
		int priv = 0;
		try {
			priv = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			return 0;
		}
		return priv;
	}

	public static void dodavanjeZaProlazKolone(ArrayList<String> kolona) {
		int zbroj = Integer.parseInt(kolona.get(6));
		if (zbroj >= 60) {
			zbroj += 30;
			kolona.set(6, Integer.toString(zbroj));
		}

	}

	public static int racunanjeRezultata(Igra igra) {
		int rezultat = 0;
		rezultat += provjeriJeliBroj(igra.getDolje().get(6)) + provjeriJeliBroj(igra.getGore().get(6))
				+ provjeriJeliBroj(igra.getSloboda().get(6)) + provjeriJeliBroj(igra.getNajava().get(6))
				+ provjeriJeliBroj(igra.getRucno().get(6));

		rezultat += provjeriJeliBroj(igra.getDolje().get(9)) + provjeriJeliBroj(igra.getGore().get(9))
				+ provjeriJeliBroj(igra.getSloboda().get(9)) + provjeriJeliBroj(igra.getNajava().get(9))
				+ provjeriJeliBroj(igra.getRucno().get(9));

		rezultat += provjeriJeliBroj(igra.getDolje().get(15)) + provjeriJeliBroj(igra.getGore().get(15))
				+ provjeriJeliBroj(igra.getSloboda().get(15)) + provjeriJeliBroj(igra.getNajava().get(15))
				+ provjeriJeliBroj(igra.getRucno().get(15));

		return rezultat;
	}

}
