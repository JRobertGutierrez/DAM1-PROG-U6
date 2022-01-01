package EjerciciosArrays_01_Temperatura;

import java.util.Scanner;

public class pruebaTemperatura {
	/**
	 * Practicando con Arrays Temperaturas
	 * 
	 * @author Robert G
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		temperaturas t = new temperaturas();

		int opcion = 0;

		t.pedir();

		do {
			System.out.println("******************************************");
			System.out.println("Elije una opci�n");
			System.out.println("1. Hayamos la temperatura media");
			System.out.println("2. Hayamos la temperatura m�xima");
			System.out.println("3. Hayamos la temperatura m�nima");
			System.out.println("4. Hayamos los d�as por encima de la media");
			System.out.println("Pulsa 0 si quieres salir del programa");
			System.out.println("******************************************");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("///////////////////////////////////////");
				System.out.println("La temperatura media es " + t.media());
				System.out.println("///////////////////////////////////////");
				break;
			case 2:
				System.out.println("///////////////////////////////////////");
				System.out.println("La temperatura m�xima es " + t.maxima());
				System.out.println("///////////////////////////////////////");
				break;
			case 3:
				System.out.println("///////////////////////////////////////");
				System.out.println("La temperatura m�nima es " + t.minima());
				System.out.println("///////////////////////////////////////");
				break;
			case 4:
				System.out.println("///////////////////////////////////////");
				System.out.println("El numero de dias por encima de la media es: " + t.encimamedia());
				System.out.println("///////////////////////////////////////");
				break;
			case 0:// Opci�n para salir del men�
				System.out.println("Ha salido del programa, hasta pronto");
				System.out.println("");
				break;
			default:
				System.out.println("No ha pulsado un n�mero del 1 al 4 o 0 para salir");
				System.out.println("******************************************");
				break;
			}
		} while (opcion != 0);
	}
}