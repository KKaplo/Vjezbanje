import javax.swing.JOptionPane;

public class LjubavniKalkulator {

	public static void main(String[] args) {
		
		String prvoIme = JOptionPane.showInputDialog("Unesi svoje ime");
		String drugoIme = JOptionPane.showInputDialog("Unesi ime simpatije");
		
		//TEST
//		String prvoIme="marta";
//		String drugoIme="manuel";
		
		RacunanjeKompaktibilnosti.izracunajKompatibilnost(prvoIme, drugoIme);
		
	}
}