package noms_ciutats;

import java.util.*;

public class Noms_Ciutats {

	public static void main(String[] args) {
		
		String nom1; // Ciutat 1
		String nom2; // Ciutat 2
		String nom3; // Ciutat 3
		String nom4; // Ciutat 4
		String nom5; // Ciutat 5
		String nom6; // Ciutat 6
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		ArrayList<String> ArrayCiutatsModificades = new ArrayList<String>();
		
		Scanner ciudad = new Scanner(System.in); // Creamos el objeto Scanner para introducir datos por consola
		
		System.out.println("Nombre de la ciudad 1: "); // Pedimos por consola la ciudad
		nom1 = ciudad.nextLine(); // Guardamos el valor en la variable
		System.out.println("Ciudad: " +nom1); // Mostramos el valor guardado
		
		System.out.println("Nombre de la ciudad 2: "); // Pedimos por consola la ciudad
		nom2 = ciudad.nextLine(); // Guardamos el valor en la variable
		System.out.println("Ciudad: " +nom2); // Mostramos el valor guardado
		
		System.out.println("Nombre de la ciudad 3: "); // Pedimos por consola la ciudad
		nom3 = ciudad.nextLine(); // Guardamos el valor en la variable
		System.out.println("Ciudad: " +nom3); // Mostramos el valor guardado
		
		System.out.println("Nombre de la ciudad 4: "); // Pedimos por consola la ciudad
		nom4 = ciudad.nextLine(); // Guardamos el valor en la variable
		System.out.println("Ciudad: " +nom4); // Mostramos el valor guardado
		
		System.out.println("Nombre de la ciudad 5: "); // Pedimos por consola la ciudad
		nom5 = ciudad.nextLine(); // Guardamos el valor en la variable
		System.out.println("Ciudad: " +nom5); // Mostramos el valor guardado
		
		System.out.println("Nombre de la ciudad 6: "); // Pedimos por consola la ciudad
		nom6 = ciudad.nextLine(); // Guardamos el valor en la variable
		System.out.println("Ciudad: " +nom6); // Mostramos el valor guardado
		
		
		System.out.println("\nCiudades: " +nom1+ "-" +nom2+ "-" +nom3+ "-" +nom4+ "-" +nom5+ "-" +nom6+ "\n"); // Mostramos por consola el resultado
	
		/*************************************************   FASE 2   ************************************************/
		
		//Añadimos las ciudades a la Array
		
		arrayCiutats.add(nom1);
		arrayCiutats.add(nom2);
		arrayCiutats.add(nom3);
		arrayCiutats.add(nom4);
		arrayCiutats.add(nom5);
		arrayCiutats.add(nom6);
		
		Collections.sort(arrayCiutats); //Ordenamos Alfanumerico
		
		for(String lista : arrayCiutats) { // Mostramos todos los elementos del Array
			System.out.print(lista+"\n");
		}
		
		/*************************************************   FASE 3   ************************************************/
		
		
		for(String lista : arrayCiutats) { // Recoremos el Array y guardamos el valor de las posiciones
			ArrayCiutatsModificades.add(lista.replace('a', '4')); // Remplazamos el caracter "a" por "4"
		}
		
		System.out.print("\nNueva Lista:");
		
		for(String lista2 : ArrayCiutatsModificades) { // Mostramos todos los elementos del Array
			System.out.print("\n" +lista2);
		}
		
	}

}
