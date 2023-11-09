package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido:
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int numero = 0;
		
		boolean primo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número positivo: ");
		
		do {
		
		try {
		
			numero = sc.nextInt();
			
		}catch (InputMismatchException e) {
			
			numero = 1;
			
			System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
			
		}
		
		}while(numero < 1);
		
		if (numero == 1) {
			
			System.out.println("El numero no es primo.");
			
		}else {
			
			
			
		}
		
		sc.close();
		
	}

}
