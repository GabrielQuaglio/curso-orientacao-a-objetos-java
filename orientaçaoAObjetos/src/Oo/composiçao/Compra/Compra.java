package Oo.composi�ao.Compra;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	
	double obterValorTota() {
		double total =0;
		
		for(Item item: itens) {
			total += item.quantidade * item.pre�o;
		}
		
		return total;
	}
	
	
	
}
