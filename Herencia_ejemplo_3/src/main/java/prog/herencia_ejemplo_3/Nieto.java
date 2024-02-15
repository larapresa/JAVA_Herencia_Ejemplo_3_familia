
package prog.herencia_ejemplo_3;

public class Nieto extends Hijo{
	
	private String deporte;
	
	public Nieto(String nombre, String apellido, int edad, String deporte){
		super(nombre, apellido,edad);
		this.deporte=deporte;
	}
	
	public Nieto(){
		deporte="surf";
	}
	
	public String toString(){
		return super.toString() + " " + deporte;
	}
}
