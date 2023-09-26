package edu.claseBienvenidaJ.servicios;

/**
 * 
 * Implementacion de la interfaz Menú.
 * */

public class MenuImplementacion implements MenuInterfaz {
	
	/**
	 * Metodo que imprime por pantalla mensaje de Bienvenida
	 * 260923-jal
	 * */

	@Override
	public void mostrarMensajeBienvenida() {
		
		String mensaje="Clinica CSI1";
		
		
		System.out.println(mensaje);
	}

}
