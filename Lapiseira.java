/* 
 * Bianca Pasetto
 * Q4
 */
package questao4;

public class Lapiseira {

	// Atributo
	private String marca;
	private String cor;
	private float grafite;

	// Construtores
	public Lapiseira(String marca, String cor, float grafite) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.grafite = grafite;
	}

	// Getters and Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getGrafite() {
		return grafite;
	}

	public void setGrafite(float grafite) {
		this.grafite = grafite;
	}

}
