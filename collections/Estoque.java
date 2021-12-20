package collections;

public class Estoque {

	
	String produto;
	int n;
	
	public Estoque (String produto, int n) {
		super();
		this.produto = produto;
		this.n = n;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getNumSerie() {
		return n;
	}
	public void setNumSerie(int n) {
		this.n = n;
	}
	public String toString() {
		return this.produto + " | nº de série: " + this.n;			
	}
	

}