package kapl.model;

import java.util.ArrayList;
import java.util.Collections;

public class Igra extends Entitet {

	ArrayList<String> dolje = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> gore = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> sloboda = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> najava = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> rucno = new ArrayList<String>(Collections.nCopies(16, " "));

	public Igra() {
		super();
	}

	public Igra(int sifra, ArrayList<String> dolje, ArrayList<String> gore, ArrayList<String> sloboda,
			ArrayList<String> najava, ArrayList<String> rucno) {
		super(sifra);
		this.dolje = dolje;
		this.gore = gore;
		this.sloboda = sloboda;
		this.najava = najava;
		this.rucno = rucno;
	}

	public ArrayList<String> getDolje() {
		return dolje;
	}

	public void setDolje(ArrayList<String> dolje) {
		this.dolje = dolje;
	}

	public ArrayList<String> getGore() {
		return gore;
	}

	public void setGore(ArrayList<String> gore) {
		this.gore = gore;
	}

	public ArrayList<String> getSloboda() {
		return sloboda;
	}

	public void setSloboda(ArrayList<String> sloboda) {
		this.sloboda = sloboda;
	}

	public ArrayList<String> getNajava() {
		return najava;
	}

	public void setNajava(ArrayList<String> najava) {
		this.najava = najava;
	}

	public ArrayList<String> getRucno() {
		return rucno;
	}

	public void setRucno(ArrayList<String> rucno) {
		this.rucno = rucno;
	}

}
