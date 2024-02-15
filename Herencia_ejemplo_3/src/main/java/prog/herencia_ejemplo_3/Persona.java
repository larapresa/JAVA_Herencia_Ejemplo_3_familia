
package prog.herencia_ejemplo_3;

public class Persona {
	
	private String nombre;
	
	public Persona(String nombre){
		this.nombre=nombre;
	}
	
	public Persona(){
		nombre="nombrePorDefecto";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString(){
		return " " + nombre;
	}
	
}
