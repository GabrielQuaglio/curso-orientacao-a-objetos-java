package Oo.composiçao.Carro;

public class Motor {

	boolean ligado = false;
	double fatorInjeçao = 1;
	
	int giros() {
		if(!ligado) {
		return 0;
		
	}else
		return (int) Math.round(fatorInjeçao*3000);
	}
	
	
	
}
