import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	// Los siguientes son los 3 tipos de constructores.
	
	// Las funciones estáticas hacen referencia y cambian datos a la propia plantilla. Cuando no son estáticos, afectan al objeto como tal.
	
	public Rectangulo() { // Crea un objeto con todo a cero. 
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}

	public Rectangulo(int color, Punto centro , double base , double altura) { // Se define las variables para luego poder asignarle el valor a partir del método rectangulo(1,2,3,4); Valores
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo(Rectangulo r) { // La "r" es un nombre para referirse a este tipo de rectángulo. Ten en cuenta que si uso puntos que hagan referencia a una sola variable, será afectada en ambos lados.
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = r.centro;
		
	}
	
	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("X e Y del rectángulo: ");
		Pantalla.escribirSaltoLinea();
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
	}
	public void cambiarDatos() {	
		
		int opc = 0;
		
	while(opc != 6) {
		
	
		System.out.println("Indica qué valor quieres cambiar");
		System.out.println("1: Altura");
		System.out.println("2: Base");
		System.out.println("3: Color");
		System.out.println("4: Punto X");
		System.out.println("5: Punto Y");
		System.out.println("6: Salir");
		opc = Teclado.leerInt();
		
		switch(opc) {
			case 1:
				do {
					Pantalla.escribirString("indica el nuevo valor de la altura: ");
					String alturaNueva = Teclado.leerString();
			
					if (!alturaNueva.isEmpty()) {
						try {
							this.altura = Double.parseDouble(alturaNueva);
						} catch (NumberFormatException e) {
							this.altura = -1;
						}
					}
				} while (this.altura <= 0.0);
				break;
				//Double.isNaN(Double.valueOf(alturaNueva));
			case 2:
				do {
					Pantalla.escribirString("Indica el nuevo valor de la base: ");
					String baseNueva = Teclado.leerString();
					Pantalla.escribirString(baseNueva);
		
					if (!baseNueva.isEmpty()) {
						try { // Esto es para ejecutar algo y checar si da error. En caso de que lo dé -> Catch
							this.base = Double.parseDouble(baseNueva);
						} catch (NumberFormatException e) { // La "e" hace referencia a una línea de texto que sale cuando sale el NumberFormatException
							this.altura = -1;
						}
					
					}
				} while (this.base <= 0.0);
				break;
			case 3:
				do {
		
					Pantalla.escribirString("indica el nuevo valor del color: ");
					String colorNuevo = Teclado.leerString();
					Pantalla.escribirString(colorNuevo);
					try {
						if (!colorNuevo.isEmpty()) {
							this.color = (int) Double.parseDouble(colorNuevo);
						}
					} catch (NumberFormatException e) {
						this.color = -1;
					}
				} while (this.color <= 0);
				break;
			case 4:
				Pantalla.escribirString("Indica el nuevo valor de la X: ");
				String xNueva = Teclado.leerString();
				try {	
					if (!xNueva.isEmpty()) {
						this.centro.setX(Integer.valueOf(xNueva));
					}
				} catch (NumberFormatException e) {
					this.centro.setX(-1);
				}
				break;
			case 5:
				Pantalla.escribirString("Indica el nuevo valor de la Y del punto: ");
				String yNueva = Teclado.leerString();
				try {
					if (!yNueva.isEmpty()) {
						this.centro.setY(Integer.valueOf(yNueva));
					}
				} catch (NumberFormatException e) {
					this.centro.setY(-1);
				}
				break;
			}
		}
	}
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
