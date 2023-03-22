package kapl.obrada;

import java.util.ArrayList;
import java.util.List;

import kapl.Pomocno;
import kapl.Start;
import kapl.model.Igra;

public class Igranje {

	private List<Igra> igranje;
	private Start start;
    
	public Igranje(Start start) {
		super();
		this.start = start;
		igranje = new ArrayList<>();

	}

	public Igranje(Start start, List<Igra> igranje) {
		super();
		this.start = start;
		this.igranje = igranje;

	}

	public void izbornik() {
		System.out.println("");
		System.out.println("IGRA IZBORNIK");
		System.out.println("Dostupne opcij: e");
		System.out.println("1. Nova tablica");
		System.out.println("2. Upute za korištenje");
		System.out.println("3. Povratak na glavni izbornik");
		odabirIzbornika();
	}

	private void odabirIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 4)) {

		case 1:
			Igra igra = new Igra();
			izbornikZaIgru(igra);
			break;
			
		case 2:
			//ispisiUputeZaKoristenje();
			izbornik();
			break;

		case 3:
			start.glavniIzbornik();
			break;
		}

	}

	private void izbornikZaIgru(Igra igra) {
		System.out.println("");
		System.out.println("ODABERI OPCIJU");
		System.out.println("Dostupne opcije: ");
		System.out.println("1. Novi unos polja");
		System.out.println("2. Promjena unosa");
		System.out.println("3. Kraj igre");
		System.out.println("---------------------------");
		igra=odabirIzbornikaZaIgru(igra);
	}

	private Igra odabirIzbornikaZaIgru(Igra igra) {
		switch (Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 3)) {

		case 1:
			igra=ispunjavanjeTablice(igra);
			izbornikZaIgru(igra);
		case 2:
			//promjena unosa

		case 3:
			igranje.add(igra);
			izbornik();
			break;
		}

		return igra;
	}

	private Igra ispunjavanjeTablice(Igra igra) {
//		ArrayList<String> dolje= new ArrayList<String>(Collections.nCopies(16, " "));
//		ArrayList<String> gore= new ArrayList<String>(Collections.nCopies(16, " "));
//		ArrayList<String> sloboda= new ArrayList<String>(Collections.nCopies(16, " "));
//		ArrayList<String> najava= new ArrayList<String>(Collections.nCopies(16, " "));
//		ArrayList<String> rucno= new ArrayList<String>(Collections.nCopies(16, " "));
		String kolona;
		String redak;
		String vrijednost;
		Pomocno.CLS();
		ispisTablice(igra.getDolje(),igra.getGore(),igra.getSloboda(),igra.getNajava(),igra.getRucno());
		System.out.println("Unos bacanja:\n--------------------------");
		kolona = Pomocno.unosDobreKolone();
		redak = Pomocno.unosDobrogRetka();
		vrijednost = Pomocno.unosVrijednosti();

		switch (kolona) {
		case "D":
			igra.setDolje(UnosURed(igra.getDolje(),redak,vrijednost));
			break;
		case "G":
			igra.setGore(UnosURed(igra.getGore(),redak,vrijednost));
			break;
		case "S":
			igra.setSloboda(UnosURed(igra.getSloboda(),redak,vrijednost));
			break;
		case "N":
			igra.setNajava(UnosURed(igra.getNajava(),redak,vrijednost));
			break;
		case "R":
			igra.setRucno(UnosURed(igra.getRucno(),redak,vrijednost));
			break;
			


		}
		ispisTablice(igra.getDolje(),igra.getGore(),igra.getSloboda(),igra.getNajava(),igra.getRucno());

		return igra;
	}



	private ArrayList<String> UnosURed(ArrayList<String> kolona, String redak, String vrijednost) {
		switch(redak) {
		case "1":
			kolona.set(0, vrijednost);
			break;
		case "2":
			kolona.set(1, vrijednost);
			break;
		case "3":
			kolona.set(2, vrijednost);
			break;
		case "4":
			kolona.set(3, vrijednost);
			break;
		case "5":
			kolona.set(4, vrijednost);
			break;
		case "6":
			kolona.set(5, vrijednost);
			break;
		case "MAX":
			kolona.set(7, vrijednost);
			break;
			//6 ostaje za zbroj
		case "MIN":
			kolona.set(8, vrijednost);
			break;
		case "2P":
			kolona.set(10, vrijednost);
			break;
			//9 ostaje za zbroj
		case "SK":
			kolona.set(11, vrijednost);
			break;
		case "FUL":
			kolona.set(12, vrijednost);
			break;
		case "POK":
			kolona.set(13, vrijednost);
			break;
		case "JAM":
			kolona.set(14, vrijednost);
			break;
		}
		return kolona;
	}

	private void ispisTablice(ArrayList<String> dolje,ArrayList<String> gore,ArrayList<String> sloboda, ArrayList<String> najava, ArrayList<String> rucno) {
		int i=0;
		System.out.printf("     =================================%n");
		System.out.printf("     ||%3s  |%3s  |%3s  |%3s  |%3s  ||%n", "G", "D", "S", "N", "R");
		System.out.printf("======================================%n");
		System.out.printf("|| 1 || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i) , gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("|| 2 || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i), sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("|| 3 || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i), gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("|| 4 || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i), gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("|| 5 || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i), gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("|| 6 || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i), gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("--------------------------------------%n");
		System.out.printf("||ZBR|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("--------------------------------------%n");
		System.out.printf("||MAX|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("||MIN|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("--------------------------------------%n");
		System.out.printf("||ZBR|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("--------------------------------------%n");
		System.out.printf("||2P || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("||SK || %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("||FUL|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("||POK|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("||JAM|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("======================================%n");
		System.out.printf("||ZBR|| %3s | %3s | %3s | %3s | %3s ||%n", dolje.get(i),gore.get(i),sloboda.get(i),najava.get(i),rucno.get(i++));
		System.out.printf("======================================%n");

	}

}
