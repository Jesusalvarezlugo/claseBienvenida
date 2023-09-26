package edu.claseBienvenidaJ.controladores;

//control shift o para importar las clases
import edu.claseBienvenidaJ.servicios.MenuImplementacion;
import edu.claseBienvenidaJ.servicios.MenuInterfaz;

/**
 * Clase principal de la aplicacion
 * 260923-jal
 * */

public class InicioAplicacion {

	public static void main(String[] args) {
		
		//Instanciamos la clase para poder hacer la llamada(creando el objeto)
		MenuInterfaz mi=new MenuImplementacion();
		
		//con el objeto llamamos al metodo que esta en la clase menuImplementacion
		mi.mostrarMensajeBienvenida();
		

	}

}
