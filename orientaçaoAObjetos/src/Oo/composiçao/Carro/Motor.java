package Oo.composi�ao.Carro;

public class Motor {

	boolean ligado = false;
	double fatorInje�ao = 1;
	
	int giros() {
		if(!ligado) {
		return 0;
		
	}else
		return (int) Math.round(fatorInje�ao*3000);
	}
	
	
	
}
