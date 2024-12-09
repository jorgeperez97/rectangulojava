import daw.com.*;

public class Rectangulo {

	private int xa;
	private int ya;
	private int xb;
	private int yb;
	private int xc;
	private int yc;
	private int xd;
	private int yd;
	private String color;
	
	public Rectangulo ()
	{
		xa = 0;
		ya = 0;
		xb = 0;
		yb = 0;
		xc = 0;
		yc = 0;
		xd = 0;
		yd = 0;
	}
	
	public Rectangulo (int xa, int ya , int xb , int yb , int xc , int yc , int xd , int yd)
	{
		this.xa = xa;
		this.ya = ya;
		this.xb = xb;
		this.yb = yb;
		this.xc = xc;
		this.yc = yc;
		this.xd = xd;
		this.yd = yd;
	}
	
	public Rectangulo (int p[])
	{
		this.xa = p[0];
		this.ya = p[1];
		this.xb = p[0];
		this.yb = p[1];
		this.xc = p[0];
		this.yc = p[1];
		this.xd = p[0];
		this.yd = p[1];
	}
	
	public Rectangulo (Rectangulo Rectangulo)
	{
		this.xa = Rectangulo.xa;
		this.ya = Rectangulo.ya;
		this.xb = Rectangulo.xb;
		this.yb = Rectangulo.yb;
		this.xc = Rectangulo.xc;
		this.yc = Rectangulo.yc;
		this.xd = Rectangulo.xd;
		this.yd = Rectangulo.yd;
	}
	
	public String color() {
		return color;
	}
	
	public int getXa() {
		return xa;
	}

	public void setXa(int xa) {
		this.xa = xa;
	}

	public int getYa() {
		return ya;
	}

	public void setYa(int ya) {
		this.ya = ya;
	}
	
	public int getXb() {
		return xb;
	}

	public void setXb(int xb) {
		this.xb = xb;
	}

	public int getYb() {
		return yb;
	}

	public void setYb(int yb) {
		this.yb = yb;
	}
	
	public int getXc() {
		return xc;
	}

	public void setXc(int xc) {
		this.xc = xc;
	}

	public int getYc() {
		return yc;
	}

	public void setYc(int yc) {
		this.yc = yc;
	}
	
	public int getXd() {
		return xd;
	}

	public void setXd(int xd) {
		this.xd = xd;
	}

	public int getYd() {
		return yd;
	}

	public void setYd(int yd) {
		this.yd = yd;
	}
	
	public void cambiarDatos ()
	{
		String lado = "";
		
		System.out.println("¿De qué lado?");
		lado = Teclado.leerString();
		
		if (lado == "A") {
			xa = Teclado.leerInt("X :");
			ya = Teclado.leerInt("Y :");
		}
		if (lado == "B") {
			xb = Teclado.leerInt("X :");
			yc = Teclado.leerInt("Y :");
		}
		if (lado == "C") {
			xc = Teclado.leerInt("X :");
			yc = Teclado.leerInt("Y :");
		}
		if (lado == "D") {
			xd = Teclado.leerInt("X :");
			yd = Teclado.leerInt("Y :");
		}
		
		
	}

	public void mostrarDatos ()
	{
		Pantalla.escribirString("Xa :" + xa);
		Pantalla.escribirString("Ya :" + ya);
		Pantalla.escribirString("Xb :" + xb);
		Pantalla.escribirString("Yb :" + yb);
		Pantalla.escribirString("Xc :" + xc);
		Pantalla.escribirString("Yc :" + yc);
		Pantalla.escribirString("Xd :" + xd);
		Pantalla.escribirString("Yd :" + yd);
	}
	
	

}
