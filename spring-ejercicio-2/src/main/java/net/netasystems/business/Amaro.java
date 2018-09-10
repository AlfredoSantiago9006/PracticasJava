package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Amaro implements Programmer{

	@Autowired
	@Qualifier("pearlLanguage")
    private Languaje languaje;

    public Amaro(Languaje languaje){
        this.languaje = languaje;
    }

    public Languaje getLanguaje() {
        return languaje;
    }

    public void setLanguaje(Languaje languaje) {
        this.languaje = languaje;
    }


    public String hackTheWorld() {
        return "Program in: "+languaje.description();
    }
}