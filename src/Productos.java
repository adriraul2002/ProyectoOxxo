 //Eunja clase en una plantrilla para organizar los atributos y metodos del objeto 
public class Productos {
	
	//Atributos del objeto
	//Constantes -- Fijos
	//Variables -- Dinamicos
	
	private String nombre;
	private float precio;
	private int stock;
	private boolean estatus;
	
	//Constructor vacio --- para realizar la instancia de clase - crea el objeto
	public Productos() {
		
	}
	
	
	//Constructor con parametros o argumentos --- sobrecarga de metrodos --- polimorfismos de sobrecarga de metodos
	public Productos(String nombre, float precio, int stock, boolean estatus) {
		//Se estan incializando los atributos del objeto
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estatus = estatus;
	}

	//Convierte el objeto en cadena
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", estatus=" + estatus + "]";
	}

	//Inicia el encapsulamiento Conformado por funciones y procedimientos
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public boolean isEstatus() {
		return estatus;
	}


	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	//Finaliza el encapsulamiento
	
}
