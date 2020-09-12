package Oo.composiçao.desafio;

import java.util.ArrayList;

public class Compra {

	
	final ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void adicionarItem(Produto p , int quantide) {
		this.itens.add(new Item(p, quantide));
	}
	
	void adicionarItem(String nome, double preço, int quantidade ) {
		this.itens.add(new Item(new Produto(nome,preço),quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item:itens) {
			total += item.quantidade*item.produto.preço;
		}
			
		return total;
	}
}
