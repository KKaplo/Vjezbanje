
public class RacunanjeKompaktibilnosti {

	public static int izracunajKompatibilnost(String prvoIme, String drugoIme) {
		
		int duljinaStringa1 = prvoIme.length();
		int duljinaStringa2 = drugoIme.length();
		
		String imeZajedno=prvoIme + drugoIme;
		
		int[] prvoImeBroj = new int[duljinaStringa1];
		int[] drugoImeBroj = new int[duljinaStringa2];
		
		for(int i=0;i<duljinaStringa1;i++) {
			prvoImeBroj[i]=brojPonavljanjaSlova(prvoIme.charAt(i) ,imeZajedno);
			
			System.out.print(prvoImeBroj[i] + " ");
		}
		System.out.print("\n");
		for(int i=0;i<duljinaStringa2;i++) {
			drugoImeBroj[i]=brojPonavljanjaSlova(drugoIme.charAt(i) ,imeZajedno);
			System.out.print(drugoImeBroj[i] + " ");
		}
		
		
			
		return 1;
	}

	private static int brojPonavljanjaSlova(char slovo,String imeZajedno) {
		
		int brojPonavljanja=0;
		
		for(int i=0;i<imeZajedno.length();i++) {
			if(slovo==imeZajedno.charAt(i)) {
				brojPonavljanja++;
			}
		}
		
		return brojPonavljanja;
	}

	

	}