
public class Z04 {

	public static void main(String[] args) {

		int prvaMatrica[][] = new int[4][4];
		int drugaMatrica[][] = new int[4][4];
		int sumaMatrica[][] = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				prvaMatrica[i][j] = (int) (Math.random() * 100);
				drugaMatrica[i][j] = (int) (Math.random() * 100);
				sumaMatrica[i][j] = prvaMatrica[i][j] + drugaMatrica[i][j];
				System.out.print(sumaMatrica[i][j] + "\t");
			}
			System.out.print("\n");
			
	}
	}
}
