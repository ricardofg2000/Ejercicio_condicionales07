package unico;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Realiza un programa que, dada una nota introducida 
		 * por el usuario, diga la nota del boletín 
		 * (insuficiente, suficiente, bien, notable o sobresaliente). */
		
		Scanner leer = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota alumno");
		nota = leer.nextInt();
		
		if (nota < 5) {
			System.out.println("Insuficiente");
		}
		if (nota == 5) {
			System.out.println("Suficiente");
		}
		if (nota == 6) {
			System.out.println("Bien");
		}
		if ((nota == 7) || (nota == 8)) {
			System.out.println("Notable");
		}
		if ((nota == 9) || (nota == 10)) {
			System.out.println("Sobresaliente");
		}
			
			
	}

}
