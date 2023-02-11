import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("vuoi inserire un piatti? (1:si) (2:no)");
		int scelta = s.nextInt();
		
		switch(scelta) {
		case 1:
			System.out.println("Inserire il nome del piatto:");
			String nome_p = s.nextLine();
			
			System.out.println("Quanti ingredianti ha:");
			int n_ing = s.nextInt();
			 
			Piatto p = new Piatto(nome_p, n_ing);
			
			p.add_piatto();
				
			break;
		case 2:
			System.out.println("Buona giornate e arrivederci");
			break;
		}
		
	}

}
