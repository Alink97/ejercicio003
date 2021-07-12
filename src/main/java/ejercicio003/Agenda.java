package ejercicio003;

import java.util.ArrayList;
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
	
	private int numAleatorio() {
		int numero = (int) Math.floor(Math.random()*lista.size());
		return numero;
	}
}
