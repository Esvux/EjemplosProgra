//Modelar un objeto
public class Motocicleta {
	//Atributos
	String marca;
	int modelo;
	String color;
	double peso;
	double precio;
	boolean estadoLuces;
	double velocidad;
	//Valores por defecto para los atributos (propiedades)
	// int -> 0
	// double -> 0.0
	// boolean -> false
	// char -> '\0000'
	// String u otros objetos -> null
	// null, es una palabra reservada que sirve para indicar 
	// que a un objeto no le ha sido asignado un espacio en 
	// memoria.

	/*
	Un método constructor NO tiene tipo
	y se llama exactamente igual que 
	la clase que construye
	*/                 //Parámetros
	public Motocicleta(String marca, String color) {
		//Cuerpo vacío
		System.out.println("Construyendo una moto " + marca + " de color " + color);
		//atributo = variable
		this.marca = marca;
		this.color = color;
	}

	public Motocicleta() {

	}
	/*
	Sobrecarga de métodos, usar el mismo nombre para más de un método
	y diferenciarlos por medio de la cantidad y el tipo de parámetros
	*/


	//Tipo vacío = void
	//visibilidad, tipo, nombre y parámetros
	public void acelerar(double incremento) {
		//Objetivo: aumentar la velocidad
		System.out.println("Acelerando!!!");
		velocidad = velocidad + incremento;
	}

	public void acelerar() {
		//Objetivo: aumentar la velocidad
		System.out.println("Acelerando de uno en uno!!!");
		velocidad++;
	}

	public void mostrarVelocidad() {
		System.out.println("Su velocidad es: " + velocidad + " Km/h");
	}



}