import java.util.Scanner;

public class Piatto {
	private String nome;
	private Ingredienti[] lista_ing;
	
	public Piatto (String nome, int n_ing) {
		setNome(nome);
		lista_ing = new Ingredienti[n_ing];
		for (int i=0; i<n_ing; i++) {
			lista_ing[i] = new Ingredienti();
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public  void add_piatto() {
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<lista_ing.length; i++) {
			System.out.println("Inseriree il"+ i +"° ingrediente:");
			System.out.print("Nome: ");
			String nome_ing = s.nextLine();
			System.out.print("Quantita': ");
			float quantita_ing = s.nextFloat();
			
			lista_ing[i] = new Ingredienti(nome_ing, quantita_ing);
		}
	}
	
	public void stampa_quantita_ing() {
		for(int i=0; i<lista_ing.length; i++){
			System.out.print("Il "+i+"° ingrediente a quantita' di: "+lista_ing[i].getQuantita());
		}
	}
	
	public float quantita_media_somma_ing(/*int scelta*/) {
		
		float somma=0;
		for(int i=0; i<lista_ing.length; i++) {
			somma += lista_ing[i].getQuantita(); 
		}
		//if(scelta==1) {
			return somma/lista_ing.length;
		/*} else {
			return somma;
		}*/
	}
	
	public int stampa_n_ing() {
		return lista_ing.length;
	}
	
	public void ricerca_quantita_ing(String nome_ing) {
		int i=0;
		do {
			i++;
		}while(lista_ing[i].getIng_nome().equals(nome_ing) || i>lista_ing.length);
		if(i>lista_ing.length) {
			System.out.println("L'ingrediente "+ nome_ing+" non e stato trovato!!");
		}else {
			System.out.println("L'ingrediente "+nome_ing+" ha questa quantita: "+lista_ing[i].getQuantita());
		}
	}
	
	public void stampa_ing_max() {
		
	}

}
