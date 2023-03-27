package kapl.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Igra extends Entitet {
	
	private List<Igrac> igraci;

	ArrayList<String> dolje = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> gore = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> sloboda = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> najava = new ArrayList<String>(Collections.nCopies(16, " "));
	ArrayList<String> rucno = new ArrayList<String>(Collections.nCopies(16, " "));

	public Igra() {
		super();
		igraci=new ArrayList<>();
	}

	public Igra(int sifra,List<Igrac> igraci, ArrayList<String> dolje, ArrayList<String> gore,
			ArrayList<String> sloboda,ArrayList<String> najava, ArrayList<String> rucno) {
		super(sifra);
		this.igraci=igraci;
		this.dolje = dolje;
		this.gore = gore;
		this.sloboda = sloboda;
		this.najava = najava;
		this.rucno = rucno;
	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
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
