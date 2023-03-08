
import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int uneseniBroj[] = new int[24];
		int suma = 0;
		int najmanji = 0;
		int najveci = 0;

		for (int i = 0; i <24; i++) {
			uneseniBroj[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i + 1) + ". broj: "));
			suma += uneseniBroj[i];
			if (i == 0) {
				najmanji = uneseniBroj[i];
				najveci = uneseniBroj[i];
			} else {
				if (uneseniBroj[i] < najmanji) {
					najmanji = uneseniBroj[i];
				}
				if (uneseniBroj[i] > najveci) {
					najveci = uneseniBroj[i];
				}
			}
		}
		System.out.print("Suma unesenih brojeva: " + suma);
		System.out.print("\nNajmanji uneseni broj: " + najmanji);
		System.out.print("\nNajveci uneseni broj: " + najveci);
	}
}
