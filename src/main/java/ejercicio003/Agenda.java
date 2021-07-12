package ejercicio003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	private List<String> lista = new ArrayList<>();
	
	public Agenda() {
		lista.add("Alejandro");
		lista.add("Bernardo");
		lista.add("Carlos");
		lista.add("Daniel");
		lista.add("Esther");
		lista.add("Fernando");
	}
	
	public String pedirNombre() {
		int aleatorio = numAleatorio();
		return lista.get(aleatorio);
	}
	
	public List<String> variosNombres(int c){
		List<String> resultado = new ArrayList<>();
		
		boolean x = false;
		do {
			String nombre = pedirNombre();
			
			Iterator<String> it = resultado.iterator();
			
			while (it.hasNext()) {
				if(nombre.equals(it)) {
					x = true;
				}
				it.next();
			}
			
			if(x == false) {
				resultado.add(nombre);
				c--;
			}
				
			
		}while(c>0);
		
		return resultado;
	}
	
	private int numAleatorio() {
		int numero = (int) Math.floor(Math.random()*lista.size());
		return numero;
	}
}
