package kapl.obrada;

import java.util.ArrayList;
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
		igraci.add(new Igrac(1,"Pero","Peric","Pera"));
		igraci.add(new Igrac(2,"Ivo","Ivic","Ivo123"));
		
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("IGRACI IZBORNIK");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih igraca");
		System.out.println("2. Unos novog igraca");
		System.out.println("3. Brisanje igraca");
		System.out.println("4. Povratak na glavni izbornik");
		odabirIzbornika();
	}

	private void odabirIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 4)) {

		case 1:
			pregled(true);
			break;

		case 2:
			unusNovog();
			break;

		case 3:
			if (igraci.size() == 0) {
				System.out.println("Nema igraca za brisanje");
				izbornik();
			} else {
				brisanje();
			}
			break;

		case 4:
			start.glavniIzbornik();
		}

	}

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("Odaberite igraca koji želite obrisati: ", 1, igraci.size());
		igraci.remove(rb - 1);
		izbornik();

	}

	private void unusNovog() {
		igraci.add(unesiNovogIgraca());
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
		System.out.println("Igraci u aplikaciji: ");
		if (igraci.isEmpty()) {
			System.out.println("Nema igraca u aplikaciji\n");
		}
		int rb = 1;
		for (Igrac i : igraci) {
			System.out.println(rb++ + "." + i);
		}
		System.out.println("------------------");
		if (prikaziIzbornik) {
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
