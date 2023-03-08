import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		int prviBroj = 0;
		int drugiBroj = 0;

		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));

		if (prviBroj == drugiBroj) {
			System.out.println("Nema prostih brojeva");
			return;
		} else if (prviBroj > drugiBroj) {
			int privremeni = prviBroj;
			prviBroj = drugiBroj;
			drugiBroj = privremeni;
		}

		for (int i = prviBroj; i <= drugiBroj; i++) {

			boolean flag = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + "\t");
			}
		}

	}

}
