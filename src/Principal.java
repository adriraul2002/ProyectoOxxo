
public class Principal {
	// main es el motor de arranque de toda aplicacion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizar la creacion de objetos
		//NombreClase nombreObjeto = new Constructores();
		//NombreClase nombreObjeto Objeto sin ser incializado
		
		//Realizar la instancia de clase utilizando el constructor vacio y Asignacion de valores utilizando el encapsulamiento
		//Ctl + shift + S (Alinea el codigo)
		
		//Creado el objeto vacio o instancia de clase
		//Tengo acceso a todo lo que contenga esa clase aqui
		Productos producto = new Productos();
		
		System.out.println("Modificaciones al proyecto");
		System.out.println(10);
		
		//Pasar los datos al objeto
		producto.setNombre("Barrritas");
		producto.setPrecio(20.5f);
		producto.setStock(5);
		producto.setEstatus(true);
		
		//Mostrar en cosola los atributos del objeto
		System.out.println("Dostos del producto 1");
		System.out.println("Nombre " + producto.getNombre());
		System.out.println("Precio" + producto.getPrecio());
		System.out.println("Stock " + producto.getStock());
		System.out.println("Estatus " + producto.isEstatus());
		
		//Realizar la instancia de clase utilizando en constructor con todos los paramentros
		Productos producto2= new Productos("Sabritas", 18, 3 , true);
		
		//Mostrar los atributos del objeto --- toString
		System.out.println("Datos del producto 2");
		System.out.println(producto2);
		
		
	}

}
