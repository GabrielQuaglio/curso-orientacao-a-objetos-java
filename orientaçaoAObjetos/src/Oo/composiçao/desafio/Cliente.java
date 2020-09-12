package Oo.composiçao.desafio;

import java.util.ArrayList;

public class Cliente {

	final String nome;
	
	Cliente(String nome){
		this.nome= nome;
	}
	
	
	final ArrayList<Compra> compras = new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compraAtual:compras) {
			total += compraAtual.obterValorTotal();
		}
		return total;
	}
	
	
}
