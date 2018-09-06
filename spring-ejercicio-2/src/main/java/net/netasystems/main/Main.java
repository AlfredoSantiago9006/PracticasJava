package net.netasystems.main;

import net.netasystems.business.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author Neta Systems / Jose Alfredo Santiago
 *
 *Clase principal del proyecto
 */
public class Main {

	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        System.out.println("Ejercicio #2 de Spring"); //Imprime mensaje en consola
        /**
         * Se crea un objeto context del tipo ApplicationContext apuntando al archivo applicationContext.xml
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Se crean 3 objetos diferentes del tipo Programmer obteniengo el Bean de cada objeto
        Programmer prgm1 = context.getBean("amaroProgrammer", Programmer.class);
        Programmer prgm2 = context.getBean("masterProgrammer", Programmer.class);
        Programmer prgm3 = context.getBean("alfredo", Programmer.class);
        //Imprime en consola el valor obtenido por cada objeto
        System.out.println("El programador #1 lo hace en: "+prgm1.hackTheWorld());
        System.out.println("El programador #2 lo hace en: "+prgm2.hackTheWorld());
        System.out.println("El programador #3 lo hace en: "+prgm3.hackTheWorld());
        
    }

}
