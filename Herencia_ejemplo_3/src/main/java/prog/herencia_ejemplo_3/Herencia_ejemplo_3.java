/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.herencia_ejemplo_3;

/**
 *
 * @author larapresa
 */
/**
 * 
 * En este ejemplo vamos a tener una clase base Persona de la que hereda
 * la clas Padre. Clase Hijo herada de clase Padre (y por lo tanto también de Persona)
 * Clase Nieto herada de clase Hijo ( y por lo tanto también de Padre, y por lo tanto también de Persona)
 * Observa los construtores de cada uno de ellos. 
 */
public class Herencia_ejemplo_3 {

    public static void main(String[] args) {
                Persona persona;
		Padre padre;
		Hijo hijo;
		Nieto nieto, otroNieto;
		
		persona=new Persona("nomPersona");
		padre=new Padre("nomPadre", "apePadre");
		hijo=new Hijo("nomHijo", "apeHijo", 27);
		nieto=new Nieto("nomNieto", "apeNieto", 14, "tenis");
		
		// al instanciar otroNieto a través del constructor por defecto 
                // va llamando al constructor sin parametros de las clases de las que hereda
		otroNieto= new Nieto();
		
		System.out.println("\nDATOS DE LA PERSONA" + persona.toString());
		
		System.out.println("\nDATOS DEL PADRE" + padre.toString());
		
		System.out.println("\nDATOS DEL HIJO" + hijo.toString());
		
		System.out.println("\nDATOS DEL NIETO" + nieto.toString());
		
		System.out.println("\nDATOS DEL OTRO NIETO" + otroNieto.toString());
    }
}
