package ejercicio_4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EnvioCorreos {
	public void enviarCorreo(List<Persona> l) {
		for(Persona p : l){
			System.out.println("Se envio correo a la direccion "+p.getCorreoEle());
		}
	}
	
	public void enviarCorreoId(Map<Integer,Persona> map) {
		Set<Integer> ids = map.keySet();
		for(Integer id : ids) {
			Persona p = map.get(id);
			System.out.println(p);
		}
	}
}
