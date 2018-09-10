package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Neta Systems / Jose Alfredo Santiago
 *
 * Clase Alfredo implementa los metodos de la clase Programmer
 */
@Component
public class Alfredo implements Programmer{

	@Autowired
	@Qualifier("php")
    private Languaje languaje;
    
    public Alfredo (Languaje languaje) {
		super();
		this.languaje = languaje;
	}

    /**
     * Getter obtiene valor de la variable
     * @return variable
     */
    public Languaje getLanguaje() {
        return languaje;
    }

    /**
     * Setter asigna valor a la variable
     * @param languaje valor asignado
     */
    public void setLanguaje(Languaje languaje) {
        this.languaje = languaje;
    }


    /**
     * Metodo que devuelve los valores obtenidos para determinado objeto
     */
    public String hackTheWorld() {
		// TODO Auto-generated method stub
		return "Program in: "+languaje.description()+" Version: "+languaje.version();
	}
    
}
