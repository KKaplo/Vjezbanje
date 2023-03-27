package kapl;

import java.util.Scanner;
import kapl.obrada.Igraci;
import kapl.obrada.Igranje;

public class Start {

	private Igraci igraci;
	private Igranje igranje;

	public Start() {

		Pomocno.ulaz = new Scanner(System.in);
		igraci = new Igraci(this);
		igranje = new Igranje(this);
		Pomocno.CLS();
		pozdravnaPoruka();
		Pomocno.Sacekaj();
		glavniIzbornik();
	}

	public void glavniIzbornik() {
		Pomocno.CLS();
		System.out.println("===============================");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("===============================");
		System.out.println("    Dostupne opcije: ");
		System.out.println("-------------------------------");
		System.out.println("\t1. Nova igra");
		System.out.println("\t2. Igraci");
		System.out.println("\t3. Izlaz iz programa");
		System.out.println("===============================");
		odabirGlavnogIzbornika();

	}

	private void odabirGlavnogIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 3)) {

		case 1:
			Pomocno.CLS();
			igranje.izbornik();

		case 2:
			Pomocno.CLS();
			igraci.izbornik();

		case 3:
			Pomocno.CLS();
			System.out.println("===============================");
			System.out.println("\tDoviđenja!");
			System.out.println("===============================");
			System.exit(0);
		}

	}

	private void pozdravnaPoruka() {
		System.out.println("===============================================");
		System.out.println("\n\tDobrodošli u Jamb terminal aplikaciju\n");
		System.out.println("===============================================");

	}
	

	public Igraci getIgraci() {
		return igraci;
	}

	public Igranje getIgranje() {
		return igranje;
	}

	public static void main(String[] args) {
		new Start();
	}

}
