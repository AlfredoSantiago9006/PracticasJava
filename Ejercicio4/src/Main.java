
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author alfre
 *
 */
public class Main {
/**
 * 
 * @param args s
 */
	public static void main(String[] args) {
		/**
		 * Construcion de Objetos del tipo Prsona con parametros predefinidos
		 */
		Persona person0 = new Usuario("Alfredo","alfredo1@mail.com");
		Persona person1 = new Usuario("Carolina","caro@mail.com");
		Persona person2 = new Usuario("Roberto","roberto@mail.com");
		Persona person3 = new Usuario("Natalia","natalia@mail.com");
		Persona person4 = new Administrador("Miriam","miriam@mail.com");
		Persona person5 = new Administrador("Cristina","cris@mail.com");
		Persona person6 = new Administrador("Andrea","andrea@mail.com");
		Persona person7 = new Administrador("Miguel","migue@mail.com");
		
		/**
		 * añade a la Lista Persona cada objeto creado
		 */
		List<Persona> l = new ArrayList<Persona>();
		
		l.add(person0);
		l.add(person1);
		l.add(person2);
		l.add(person3);
		l.add(person4);
		l.add(person5);
		l.add(person6);
		l.add(person7);
		 /**
		  * Instancia la clase EnvioCorreo
		  */
		EnvioCorreos ec = new EnvioCorreos();
		ec.enviarCorreo(l);
		
		Map<Integer, Persona> map = new HashMap<Integer, Persona>();
		map.put(1, person0);
		map.put(2, person1);
		
		ec.enviarCorreoId(map);
		
		
	}

}
