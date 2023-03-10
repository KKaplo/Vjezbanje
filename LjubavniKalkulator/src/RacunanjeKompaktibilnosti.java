import java.util.Arrays;
import javax.swing.JOptionPane;

public class RacunanjeKompaktibilnosti {

	public static void izracunajKompatibilnost(String prvoIme, String drugoIme) {

		int duljinaStringa1 = prvoIme.length();
		int duljinaStringa2 = drugoIme.length();

		String imeZajedno = prvoIme + drugoIme;

		int[] prvoImeBroj = new int[duljinaStringa1];
		int[] drugoImeBroj = new int[duljinaStringa2];

		for (int i = 0; i < duljinaStringa1; i++) {
			prvoImeBroj[i] = brojPonavljanjaSlova(prvoIme.charAt(i), imeZajedno);
		}

		for (int i = 0; i < duljinaStringa2; i++) {
			drugoImeBroj[i] = brojPonavljanjaSlova(drugoIme.charAt(i), imeZajedno);
		}

		drugoImeBroj = okreniNiz(drugoImeBroj);

		int duziNiz = Math.max(prvoImeBroj.length, drugoImeBroj.length);

		int[] nizZajedno = new int[duziNiz];

		nizZajedno = prvoSpajanjeNiza(prvoImeBroj, drugoImeBroj, duziNiz);

		// TEST
		System.out.println(Arrays.toString(prvoImeBroj));
		System.out.println(Arrays.toString(drugoImeBroj));
		System.out.println(Arrays.toString(nizZajedno) + "\n");

		izracunajKompaktibilnost(nizZajedno, nizZajedno.length);

		return;
	}

	private static void izracunajKompaktibilnost(int[] nizZajedno, int duzinaNiza) {
		int rezultat = 0;
		int brojNula = 0;
		if (jesuLiOstalaDvaBroja(nizZajedno)) {
			rezultat = nizZajedno[0] * 10 + nizZajedno[1];
			System.out.println("\n" + rezultat);
			
			JOptionPane.showMessageDialog(null,("Imate " + rezultat + "% šanse da razvijete ljubav"));
			
			return;
		}

		for (int i = 0, j = duzinaNiza - 1; i < duzinaNiza; i++, j--) {
			if (i <= (duzinaNiza / 2) - 1) {
				nizZajedno[i] += nizZajedno[j];
			} else if ((i > (duzinaNiza / 2 - 1) && (i != j))) {
				nizZajedno[i] = 0;
				brojNula++;
			}
		}
		
		System.out.println(Arrays.toString(nizZajedno));
		
		for(int i=0;i<duzinaNiza;i++) {
			if((nizZajedno[i]/10)>0) {
				brojNula--;
				nizZajedno= razdvojiBroj(nizZajedno,i);
			}
		}

		System.out.println(Arrays.toString(nizZajedno));

		izracunajKompaktibilnost(nizZajedno, duzinaNiza - brojNula);

	}

	private static boolean jesuLiOstalaDvaBroja(int[] nizZajedno) {
		for(int i=2;i<nizZajedno.length;i++) {
			if(nizZajedno[i]>0) {
				return false;
			}
		}
		return true;
	}

	private static int[] razdvojiBroj(int[] nizZajedno,int pocetak) {
		
		int temp1=0;
		int temp2=0;
		
		for(int i=pocetak;i<nizZajedno.length-1;i++) {
			if(i==pocetak) {
				temp1=nizZajedno[pocetak+1];
				nizZajedno[pocetak+1]=nizZajedno[pocetak]%10;
				nizZajedno[pocetak]/=10;
				
			}
			else if(i>=(pocetak+2)) {
				temp2=nizZajedno[i];
				nizZajedno[i]=temp1;
				temp1=temp2;
			}
		}
		
		return nizZajedno;
	}

	private static int[] prvoSpajanjeNiza(int[] prvoImeBroj, int[] drugoImeBroj, int duziNiz) {
		int nizZajedno[] = new int[duziNiz];
		for (int i = 0; i < duziNiz; i++) {
			if (prvoImeBroj.length > i) {
				nizZajedno[i] += prvoImeBroj[i];
			}
			if (drugoImeBroj.length > i) {
				nizZajedno[i] += drugoImeBroj[i];
			}
		}
		return nizZajedno;
	}

	private static int[] okreniNiz(int[] drugoImeBroj) {
		int brojac = 0;
		int[] noviNiz = new int[drugoImeBroj.length];

		for (int i = drugoImeBroj.length - 1; i >= 0; i--) {
			noviNiz[brojac] = drugoImeBroj[i];
			brojac++;
		}

		return noviNiz;
	}

	private static int brojPonavljanjaSlova(char slovo, String imeZajedno) {

		int brojPonavljanja = 0;

		for (int i = 0; i < imeZajedno.length(); i++) {
			if (slovo == imeZajedno.charAt(i)) {
				brojPonavljanja++;
			}
		}

		return brojPonavljanja;
	}

}