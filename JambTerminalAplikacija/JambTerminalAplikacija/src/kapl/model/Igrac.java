package kapl.model;

public class Igrac extends Entitet {
	private String ime;
	private String prezime;

	public Igrac() {
		super();
	}

	public Igrac(int sifra, String ime, String prezime) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;

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

	@Override
	public String toString() {
		return (ime + " " + prezime);
	}

}
