import daw.com.*;
public class ejecutar {

	public static void main(String[] args) {
		
		Rectangulo prueba = new Rectangulo(4, new Punto(5,7), 5.0, 3.0);
		
		prueba.mostrarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		Rectangulo copia = new Rectangulo(prueba);

		prueba.setColor(0);
		copia.mostrarDatos();
		
		prueba.getCentro().setX(2);
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("ORIGINAL: -----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		prueba.mostrarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("COPIA: -----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		copia.mostrarDatos();
		
		prueba.cambiarDatos();
	}

}
