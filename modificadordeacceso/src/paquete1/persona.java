package paquete1;

public class persona {
	
	String nombre = "";
	
	int edad = 0;
	
	protected String domicilio = "";
	
	public float estatura = 0;
	
	public	String Saludar() {
	 	return "Hola, mi nombre es " + this.nombre + " mi edad es " + this.edad + 
	 			"mi domicilio " + this.domicilio + "mi estatura es " + this.estatura;

		}
}
