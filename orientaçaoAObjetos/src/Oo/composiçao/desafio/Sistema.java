package Oo.composiçao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra com1 = new Compra();
		com1.adicionarItem("Caneta", 1,100);
		com1.adicionarItem("Notebook", 2000,2 );
		
		Compra com2 = new Compra();
		com2.adicionarItem("Caderno", 10,10);
		com2.adicionarItem("Notebook", 1000,1 );
		
		Cliente c1 = new Cliente("Alexandre");
		c1.adicionarCompra(com1);
		c1.adicionarCompra(com2);
		
		System.out.println(c1.obterValorTotal());
		
	}
}
