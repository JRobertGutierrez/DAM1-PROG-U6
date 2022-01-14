package app;

import java.util.ArrayList;
import java.util.Scanner;

import mediosDeTransporte.Vehiculo;
import recorridos.InformePersona;
import recorridos.InformeVehiculo;
import recorridos.Viaje;
import usuarios.Persona;
import usuarios.Propietario;
import usuarios.Viajero;

public class Gesvehicom {
	/**
	 * Paquete app: Gesvehicom aplicaci�n
	 * 
	 * @author Robert G
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>();
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();

		int switch1 = 0, switch2 = 0;

		do {
			System.out.println("\nElige una opci�n:\n1. A�adir viajero\n2. A�adir veh�culo\n3. A�adir propietario\n"
					+ "4. A�adir viaje\n5. Informe personas\n6. Informe veh�culos\n7. Salir del programa\n");
			switch1 = sc.nextInt();

			switch (switch1) {
			case 1:// A�adir viajero
				personas.add(Viajero.darAlta());
				System.out.println("Viajero a�adido");
				System.out.println(personas);
				break;
			case 2:// A�adir veh�culo
				do {
					System.out.println("\nElige una opci�n:\n1. A�adir coche\n2. A�adir furgoneta\n3. Volver\n");
					switch2 = sc.nextInt();

					switch (switch2) {
					case 1:// A�adir Coche
						vehiculos.add(Vehiculo.darAlta(1));
						System.out.println("Coche a�adido");
						System.out.println(vehiculos);
						break;
					case 2:// A�adir Furgoneta
						vehiculos.add(Vehiculo.darAlta(2));
						System.out.println("Furgoneta a�adido");
						System.out.println(vehiculos);
						break;
					case 3:// Opci�n para salir del men�
						break;
					default:
						System.out.println("No ha pulsado un n�mero del 1 al 3\n**********************************");
						break;
					}
				} while (switch2 != 3);
				System.out.println("Furgoneta a�adida");
				System.out.println(vehiculos);
				break;
			case 3:// A�adir Propietario
				personas.add(Propietario.darAlta());
				System.out.println("Propietario a�adido");
				System.out.println(personas);
				break;
			case 4:// A�adir Viaje
				viajes.add(Viaje.darAlta());
				System.out.println("Viaje a�adido");
				System.out.println(viajes);
				break;
			case 5:// Informe Personas
				System.out.println("\nMostrar informes de personas\n****************************");
				InformePersona iPersona = new InformePersona(personas);
				iPersona.mostrarInforme();
				break;
			case 6:// Informe Veh�culos
				System.out.println("\nMostrar informes de veh�culos\n*****************************");
				InformeVehiculo iVehiculos = new InformeVehiculo(vehiculos);
				iVehiculos.mostrarInforme();
				break;
			case 7:
				break;// Salir y mostrar� el sysout que hay despu�s del do while
			default:// El cliente no ha introducido un n�mero del 1 al 6
				System.out.println("No ha pulsado un n�mero del 1 al 6");
				System.out.println("******************************************");
				break;
			}// Fin del switch opciones
		} while (switch1 != 7);// Mientras no pulsamos 7 seguimos dentro del programa
		System.out.println("Ha salido del programa - Hasta pronto");
	}
}
