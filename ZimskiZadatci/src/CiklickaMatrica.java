import javax.swing.JOptionPane;

public class CiklickaMatrica {

	public static void main(String[] args) {

		int orginalnaSirina = 0;
		int orginalnaDuzina = 0;
		int minSirina = 0;
		int minDuzina = 0;
		int brojac = 1;

		 orginalnaSirina = Integer.parseInt(JOptionPane.showInputDialog("Unesi sirinu matrice: "));
		 orginalnaDuzina = Integer.parseInt(JOptionPane.showInputDialog("Unesi duzinu matrice: "));

//		 TEST
//
//		orginalnaSirina = 10;
//		orginalnaDuzina = 6;

		int maxSirina = orginalnaSirina - 1;
		int maxDuzina = orginalnaDuzina - 1;
		int Matrica[][] = new int[orginalnaDuzina][orginalnaSirina];

		for (;brojac<=(orginalnaSirina*orginalnaDuzina);) {
			for (int i = maxSirina; i >= minSirina; i--) {
				if(brojac>(orginalnaSirina*orginalnaDuzina)) {
					break;
				}
				else {
				Matrica[maxDuzina][i] = brojac;
				brojac++;
				}
			}

			maxDuzina--;

			for (int i = maxDuzina; i >= minDuzina; i--) {
				if(brojac>(orginalnaSirina*orginalnaDuzina)) {
					break;
				}
				else {
				Matrica[i][minSirina] = brojac;
				brojac++;
				}
				
			}

			minSirina++;

			
			for (int i = minSirina; i <= maxSirina; i++) {
				if(brojac>(orginalnaSirina*orginalnaDuzina)) {
					break;
				}
				else {
				Matrica[minDuzina][i] = brojac;
				brojac++;
				
				}
			}

			minDuzina++;

			
			for (int i = minDuzina; i <= maxDuzina; i++) {
				if(brojac>(orginalnaSirina*orginalnaDuzina)) {
					break;
				}
				else {
				Matrica[i][maxSirina] = brojac;
				brojac++;
				}
				
			}

			maxSirina--;

//			if(brojac>(orginalnaSirina*orginalnaDuzina)) {
//				break;
//			}

		}

		// Ispis matrice

		for (int i = 0; i < orginalnaDuzina; i++) {
			for (int j = 0; j < orginalnaSirina; j++) {
				System.out.print(Matrica[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}
}
