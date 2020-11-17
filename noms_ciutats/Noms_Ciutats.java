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
		
		ArrayList<String> ciudad1 = new ArrayList<String>();
		ArrayList<String> ciudad2 = new ArrayList<String>();
		ArrayList<String> ciudad3 = new ArrayList<String>();
		ArrayList<String> ciudad4 = new ArrayList<String>();
		ArrayList<String> ciudad5 = new ArrayList<String>();
		ArrayList<String> ciudad6 = new ArrayList<String>();
		
		
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
	
		
		/*************************************************   FASE 4   ************************************************/
		
		for(int i=0; i<nom1.length(); i++) {
			String dato = Character.toString(nom1.charAt(i));
			ciudad1.add(i, dato);
		}
		
		for(int i=0; i<nom2.length(); i++) {
			String dato = Character.toString(nom2.charAt(i));
			ciudad2.add(i, dato);
		}
		
		for(int i=0; i<nom3.length(); i++) {
			String dato = Character.toString(nom3.charAt(i));
			ciudad3.add(i, dato);
		}
		
		for(int i=0; i<nom4.length(); i++) {
			String dato = Character.toString(nom4.charAt(i));
			ciudad4.add(i, dato);
		}
		
		for(int i=0; i<nom5.length(); i++) {
			String dato = Character.toString(nom5.charAt(i));
			ciudad5.add(i, dato);
		}
		
		for(int i=0; i<nom6.length(); i++) {
			String dato = Character.toString(nom6.charAt(i));
			ciudad6.add(i, dato);
		}
		
		
		int num1 = ciudad1.size();
		int num2 = ciudad2.size();
		int num3 = ciudad3.size();
		int num4 = ciudad4.size();
		int num5 = ciudad5.size();
		int num6 = ciudad6.size();
		
		for(int j=0; j < ciudad1.size(); j++) {
			num1--;
			System.out.print(ciudad1.get(num1));
			
		}
		
		System.out.print("\n");
		
		for(int j=0; j < ciudad2.size(); j++) {
			num2--;
			System.out.print(ciudad2.get(num2));
			
		}
		
		System.out.print("\n");
		
		for(int j=0; j < ciudad3.size(); j++) {
			num3--;
			System.out.print(ciudad3.get(num3));
			
		}
		
		System.out.print("\n");
		
		for(int j=0; j < ciudad4.size(); j++) {
			num4--;
			System.out.print(ciudad4.get(num4));
			
		}
		
		System.out.print("\n");
		
		for(int j=0; j < ciudad5.size(); j++) {
			num5--;
			System.out.print(ciudad5.get(num5));
			
		}
		
		System.out.print("\n");
		
		for(int j=0; j < ciudad6.size(); j++) {
			num6--;
			System.out.print(ciudad6.get(num6));
			
		}
		
		
	}

}
