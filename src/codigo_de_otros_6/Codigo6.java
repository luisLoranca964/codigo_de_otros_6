package codigo_de_otros_6;
/*
 * Este programa arroja 20 numeros aleatorios para que el usuario despues ingrese 5,2 0 7 para resaltar con [] los que son multiplos
 *  del numero ingresado 
 * */ 
import java.util.Scanner;

//Se cambia a mayuscula la primera letra del nombre la la clase porque es buena practica
public class Codigo6 {
	public static void main(String[] args) {
		// Se inicializa un scanner para poder escribir en consola
		Scanner sc = new Scanner(System.in);
		// Se agrega new despues de igual porque asi es como se inicializa un array
		int[] n = new int[20];

		// Se agrega un simbolo de + porque asi se representa la expresion de incremento
		// de una variable en +1
		for (int i = 0; i < 20; i++) {
			n[i] = (int) (Math.random() * 381) + 20;
			// Se agrega out para poder mostrar en consola correctamente
			System.out.print(n[i] + " ");
		}
		// Se agrega la n al final del sysout
		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		// Se agrega un parentesis al final de la linea
		// Se cambia System.console().readLine por sc.nextLine()
		int opcion = Integer.parseInt(sc.nextLine());
		// Se cambia la expresion : 5 ? 7 por ? 5 : 7
		int multiplo = (opcion == 1) ? 5 : 7;

		// Se cambia foreach por for
		for (int e : n) {
			if (e % multiplo == 0) {
				System.out.print("[" + e + "] ");
				// Se saca el else del if
			} else {
				// Se cambia in por out
				System.out.print(e + " ");
			}
		}
	}
}
