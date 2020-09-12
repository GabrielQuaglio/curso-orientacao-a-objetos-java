package Oo.composiçao.Compra;

public class CompraTeste {

	public static void main(String[] args) {
		//relaçao 1 pra N pois(no caso a classe compra pra classe itens),pois uma compra tem varios itens
		Compra compra1 = new Compra();
		compra1.cliente = " Joao Pedro";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTota());
		
		
	}
}
