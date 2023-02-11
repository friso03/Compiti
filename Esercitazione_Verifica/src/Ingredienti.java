
public class Ingredienti {
	private String ing_nome;
	private float quantita;
	
	public Ingredienti(String ing_nome, float quantita) {
		setIng_nome(ing_nome);
		setQuantita(quantita);
	}
	public Ingredienti() {
		setIng_nome("");
		setQuantita(0);
	}

	public String getIng_nome() {
		return ing_nome;
	}

	public void setIng_nome(String ing_nome) {
		this.ing_nome = ing_nome;
	}

	public float getQuantita() {
		return quantita;
	}

	public void setQuantita(float quantita) {
		this.quantita = quantita;
	}
}
