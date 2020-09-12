package Oo.composiçao.Compra;

public class Item {

	
	String nome;
	int quantidade;
	double preço;
	
	Item( String nome, int quantidade, double preço){
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return nome + preço;
	}
	
	
}
