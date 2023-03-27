package kapl.obrada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kapl.Pomocno;
import kapl.Start;
import kapl.model.Igrac;

public class Igraci {

	private List<Igrac> igraci;
	private Start start;

	public Igraci(Start start) {
		super();
		this.start = start;
		igraci = new ArrayList<>();
		testPodatci();
	}

	public Igraci(Start start, List<Igrac> igraci) {
		super();
		this.start = start;
		this.igraci = igraci;
		testPodatci();
	}

	private void testPodatci() {
		ArrayList<Integer> testRezultati1 = new ArrayList<>(Arrays.asList(1845, 2003, 1942));
		ArrayList<Integer> testRezultati2 = new ArrayList<>(Arrays.asList(1739, 1863, 1999));
		ArrayList<Integer> testRezultati3 = new ArrayList<>(Arrays.asList(1673, 1576, 1930, 2000, 1333));

		igraci.add(new Igrac(1, "Pero", "Peric", "Pera", testRezultati1));
		igraci.add(new Igrac(2, "Ivo", "Ivic", "Ivo123", testRezultati2));
		igraci.add(new Igrac(3, "Ante", "Antic", "Ante", testRezultati3));

	}

	public void izbornik() {
		Pomocno.CLS();
		System.out.println("==========================================");
		System.out.println("IGRACI IZBORNIK");
		System.out.println("==========================================");
		System.out.println("    Dostupne opcije");
		System.out.println("------------------------------------------");
		System.out.println("\t1. Pregled svih igraca");
		System.out.println("\t2. Pregled informacija igraca");
		System.out.println("\t3. Unos novog igraca");
		System.out.println("\t4. Brisanje igraca");
		System.out.println("\t5. Povratak na glavni izbornik");
		System.out.println("==========================================\n");
		odabirIzbornika();
	}

	private void odabirIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 5)) {

		case 1:
			pregled(true);
			break;

		case 2:
			pregledInformacijaIgraca();
			break;

		case 3:
			unusNovog();
			break;

		case 4:
			Pomocno.CLS();
			if (igraci.size() == 0) {
				System.out.println("=======================");
				System.out.println("Nema igraca za brisanje");
				System.out.println("=======================");
				Pomocno.Sacekaj();
				izbornik();
			} else {
				brisanje();
			}
			break;

		case 5:
			start.glavniIzbornik();
			break;
		}

	}

	private void pregledInformacijaIgraca() {
		Pomocno.CLS();
		System.out.println("===============================================");
		String korisnickoIme;
		korisnickoIme = Pomocno.unosTeksta("Unesi korisnicko ime igraca: "
				+ "\n===============================================\n");
		for (Igrac igr : igraci) {
			if (korisnickoIme.equals(igr.getKorisnickoIme())) {
				Pomocno.CLS();
				System.out.println("=====================================");
				System.out.println("Ime: " + igr.getIme());
				System.out.println("Prezime: " + igr.getPrezime());
				System.out.println("-------------------------------------");
				System.out.println("REZULTATI: ");
				if (igr.getRezultati().isEmpty()) {
					System.out.println("Igrac nema unesenih rezultata u igri");
					System.out.println("=====================================");
					izbornik();
				} else {
					Pomocno.ispisRezultata(igr.getRezultati());
					System.out.println("=====================================");
					Pomocno.Sacekaj();
					izbornik();
				}
			}

		}
		Pomocno.CLS();
		System.out.println("=================================================");
		System.out.println("Ne postoji igrac sa unesenim korisnickim imenom");
		System.out.println("=================================================");
		Pomocno.Sacekaj();
		izbornik();

	}

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("Odaberite igraca koji želite obrisati: ", 1, igraci.size());
		igraci.remove(rb - 1);
		System.out.println("=======================");
		Pomocno.Sacekaj();
		izbornik();

	}

	private void unusNovog() {
		Pomocno.CLS();
		System.out.println("=======================");
		igraci.add(unesiNovogIgraca());
		System.out.println("=======================");
		Pomocno.Sacekaj();
		izbornik();

	}

	private Igrac unesiNovogIgraca() {
		Igrac i = new Igrac();
		i.setSifra(Pomocno.unosBrojRaspon("Unesi šifru igraca: ", 1, Integer.MAX_VALUE));
		i.setIme(Pomocno.unosTeksta("Unesi ime igraca: "));
		i.setPrezime(Pomocno.unosTeksta("Unesi prezime igraca: "));
		i.setKorisnickoIme(Pomocno.unosTeksta("Unesi korisnicko ime igraca: "));
		return i;
	}

	private void pregled(boolean prikaziIzbornik) {
		Pomocno.CLS();
		System.out.println("=======================");
		System.out.println("Igraci u aplikaciji: ");
		System.out.println("=======================");
		if (igraci.isEmpty()) {
			System.out.println("Nema igraca u aplikaciji\n");
			Pomocno.Sacekaj();
			izbornik();
		}
		int rb = 1;
		for (Igrac i : igraci) {
			System.out.println(rb++ + "." + i);
		}
		System.out.println("=======================\n");
		if (prikaziIzbornik) {
			Pomocno.Sacekaj();
			izbornik();
		}

	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}

}
