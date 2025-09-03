package aula5;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		Onibus mercedes = new Onibus();
		
		ferrari.ligar();
		ferrari.desligar();
		ferrari.engatar();
		ferrari.frear();
		ferrari.acelerar();
		ferrari.manobrar();
		
		System.out.println("");
		
		mercedes.acelerar();
		mercedes.desligar();
		mercedes.engatar();
		mercedes.frear();
		mercedes.manobrar();
		mercedes.ligar();

	}

}
