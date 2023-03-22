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
		igranje= new Igranje(this);
		pozdravnaPoruka();
		glavniIzbornik();
	}

	public void glavniIzbornik() {
		System.out.println();
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("Dostupne opcije");
		System.out.println("1. Nova igra");
		System.out.println("2. Igraci");
		System.out.println("3. Pregled igara");
		System.out.println("4. Izlaz iz programa");
		odabirGlavnogIzbornika();

	}

	private void odabirGlavnogIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 4)) {
		
		case 1:
			igranje.izbornik();

		case 2:
			// Pomocno.CLS();
			igraci.izbornik();

		case 4:
			break;
		}

	}

	private void pozdravnaPoruka() {
		System.out.println("\n\tDobrodošli u Jamb terminal aplikaciju\n");

	}

	public static void main(String[] args) {
		new Start();
		System.out.println("Doviđenja!");
	}



}
