
package prog.herencia_ejemplo_3;


public class Padre extends Persona{
	
	private String apellido;
	
	public Padre(String nombre, String apellido){
		super(nombre);
		this.apellido=apellido;
	}
	
	public Padre(){
		apellido="apellidoPorDefecto";
	}
	public String toString(){
		return super.toString() + " " + apellido;
	}
}
