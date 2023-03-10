import javax.swing.JOptionPane;

public class LjubavniKalkulator {

	public static void main(String[] args) {
		
		String prvoIme = JOptionPane.showInputDialog("Unesi svoje ime");
		String drugoIme = JOptionPane.showInputDialog("Unesi svoje ime");
		
		int test = RacunanjeKompaktibilnosti.izracunajKompatibilnost(prvoIme, drugoIme);
		
		//System.out.println(RacunanjeKompaktibilnosti.izracunajKompatibilnost(prvoIme, drugoIme));
	}
}