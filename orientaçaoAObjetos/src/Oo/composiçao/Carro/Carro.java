package Oo.composi�ao.Carro;

public class Carro {

	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInje�ao >= 3.2) {
		motor.fatorInje�ao += 0.4;
	}
	}
	void frear() {
		if (motor.fatorInje�ao >= 0.2) {
			
			motor.fatorInje�ao -= 0.4;
		}
	}
	
	void ligar ( ) {
		motor.ligado = true;
	}
	void desligar() {
	  motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
