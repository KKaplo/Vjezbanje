package kapl.model;

public class Igrac extends Entitet {
	private String ime;
	private String prezime;
	private String korisnickoIme;

	public Igrac() {
		super();
	}

	public Igrac(int sifra, String ime, String prezime, String korisnickoIme) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;

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

	@Override
	public String toString() {
		return (korisnickoIme);
	}

}
