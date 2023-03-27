package kapl.model;

import java.util.ArrayList;

public class Igrac extends Entitet {
	private String ime;
	private String prezime;
	private String korisnickoIme;
	private ArrayList <Integer> rezultati;

	public Igrac() {
		super();
		rezultati=new ArrayList<Integer>();
	}

	public Igrac(int sifra, String ime, String prezime, String korisnickoIme,ArrayList <Integer> rezultati) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.rezultati=rezultati;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public ArrayList<Integer> getRezultati() {
		return rezultati;
	}

	public void setRezultati(ArrayList<Integer> rezultati) {
		this.rezultati = rezultati;
	}

	@Override
	public String toString() {
		return (korisnickoIme);
	}

}
