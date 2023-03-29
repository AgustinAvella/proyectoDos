package org.aavella.proyectoDos;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente("Matias", "Alé", "1444", "Emilio mitre 940", 200000.00, 500, 100000.00);
		System.out.println(gerente.toString());
		gerente.aumentarRemuneracion(40);
		System.out.println(gerente.getRemuneracion());

	}

}
