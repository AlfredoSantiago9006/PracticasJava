package estruccturasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.management.ListenerNotFoundException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejemplo de uso de collections");
		//Lista
		List listaCliente = new ArrayList();
		//1.1
		Cliente c1 = new Cliente("Ana","ana@mail.com");
		Cliente c2 = new Cliente("Rena","rena@mail.com");
		Cliente c3 = new Cliente("Mario","Mario@mail.com");
		
		listaCliente.add(c1);
		listaCliente.add(c2);
		listaCliente.add(c3);
		
		for(int i=0; i<listaCliente.size();i++) {
			System.out.println("Cliente: "+listaCliente.get(i));
		}
		//foreach
		for(Object o : listaCliente) {
			Cliente c = (Cliente) o;
			System.out.println("Cliente "+c);
		}
		System.out.println("#####################################################");
		
		Set clienteSet = new HashSet();
		boolean agregado;
		agregado=clienteSet.add(c1);
		System.out.println(agregado);
		agregado=clienteSet.add(c2);
		System.out.println(agregado);
		agregado=clienteSet.add(c3);
		System.out.println(agregado);
		agregado=clienteSet.add(c3);
		System.out.println(agregado);
		
		for(Object o : clienteSet) {
			Cliente c = (Cliente)o;
			System.out.println("Cliente set"+c);
		}
		
		
		System.out.println("#####################################################");
		Map mapa = new HashMap();
		
		mapa.put(1, c1);
		mapa.put(2, c2);
		mapa.put(3, c3);
		mapa.put(5, 5);
		
		Set llavesMapa = mapa.keySet();
		
		for(Object o : llavesMapa) {
			try {
			Object clienteDentroMapa = mapa.get(o);
			Cliente c = (Cliente) clienteDentroMapa;
			System.out.println("Cliente Obtenido "+ c);
			}catch (ClassCastException e) {
				System.out.println("No se reconoce el tipo de variable");
			}
		}
		
		
	}

}
