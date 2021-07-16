import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.*;
import java.util.ArrayList;
import javax.print.DocFlavor.STRING;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * La coleccion Set no puede contener elementos duplicados
		 * Solo tiene los metodos heredados de Collection
		 * Existen diferentes tipos de implementaciones
		 * 
		 * HashSet: Esta implementacion almacena los elementos en una 
		 * tabla hash. Es la que mejor rendimiento tiene.
		 * Los elementos no tienen un orden
		 */
		
		/*Set<String> frutas =new HashSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Manzana");
		
		for(String fruta: frutas) {
			System.out.println(fruta);*/
		/*Set<String> frutas =new TreeSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Manzana");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}*/
		/*Set<String> frutas =new LinkedHashSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Manzana");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}*/
		/*
		 * La interfaz List define una sucesion de elementos
		 * Si adminte duplicados
		 * Añade nuevos metodos que podemos usar
		 * Acceso posicional: Manipula eelementos en funcion de su posicion en la lista
		 * Busqueda de elementos: Busca un elemento concreto de la lista y devuelve su posicion
		 * Rango de operacion: permite realizar ciertas operaciones sobre estos rangos de 
		 * 
		 * Implementaciones
		 * ArrayList
		 * LinkedList
		 */
		/*List<String> frutas =new ArrayList();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Manzana");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		int pera=frutas.indexOf("Pera");
		System.out.println(frutas.get(pera));*/
		
		/*
		 * int es un dato primitivo
		 * Integer es un objeto
		 */
		/*List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(456);
		agenda .add(789);
		
		for(Integer a: agenda) {
			System.out.println(a);
		}*/
		
		List<String> animales =new LinkedList();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		for(String fruta: animales) {
			System.out.println(fruta);
		}
	}

}
