package Oo.composi�ao.Compra;

public class Item {

	
	String nome;
	int quantidade;
	double pre�o;
	
	Item( String nome, int quantidade, double pre�o){
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return nome + pre�o;
	}
	
	
}
