package Oo.composiçao.Carro;

public class Carro {

	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInjeçao >= 3.2) {
		motor.fatorInjeçao += 0.4;
	}
	}
	void frear() {
		if (motor.fatorInjeçao >= 0.2) {
			
			motor.fatorInjeçao -= 0.4;
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
