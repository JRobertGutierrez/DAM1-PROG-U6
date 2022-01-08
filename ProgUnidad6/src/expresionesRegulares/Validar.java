package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
	/**
	 * Practicando con Expresiones regulares
	 * 
	 * @author Robert G
	 */
	static Scanner sc = new Scanner(System.in);

	public void validaentero() {// Opci�n 1 del men�
		sc = new Scanner(System.in);
		String entero;
		System.out.print("Introduce n�mero entero: ");
		entero = sc.next();
		Pattern pat = Pattern.compile("-?[0-9]*"); // * Indica 0 � m�s veces. Equivale a {0,}
		Matcher mat = pat.matcher(entero);
		if (mat.matches()) {
			System.out.println("\n********************\nN�mero entero V�lido\n********************");
		} else {
			System.out.println("\n***********************\nN�mero entero No V�lido\n***********************");
		}
	}

	public void validaenteropositivo() {// Opci�n 2 del men�
		sc = new Scanner(System.in);
		String enteropos;
		System.out.print("Introduce n�mero entero positivo: ");
		enteropos = sc.next();
		Pattern pat = Pattern.compile("[0-9]*"); // * Indica 0 � m�s veces. Equivale a {0,}
		Matcher mat = pat.matcher(enteropos);
		if (mat.matches()) {
			System.out.println(
					"\n****************************\nN�mero entero positivo V�lido\n****************************");
		} else {
			System.out.println(
					"\n****************************\nN�mero entero positivo No V�lido\n****************************\n");
		}
	}

	public void validadni() {// Opci�n 3 del men�
		sc = new Scanner(System.in);
		String dni;
		System.out.print("Introduce dni: \n Con 8 n�meros y letra en mayuscula por favor");
		dni = sc.next();
		Pattern pat = Pattern.compile("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		Matcher mat = pat.matcher(dni);
		if (mat.matches()) {
			System.out.println("DNI V�lido");
		} else {
			System.out.println("DNI No V�lido");
		}
	}

	public void validabinario() {// Opci�n 4 del men�
		sc = new Scanner(System.in);
		String binario;
		System.out.print("Introduce n�mero binario: \n Recuerda que solo puede contener 0 o 1 la cantidad que sea: ");
		binario = sc.next();
		Pattern pat = Pattern.compile("^[0-1]+$"); // + Indica 1 � m�s veces. Equivale a {1,}
		Matcher mat = pat.matcher(binario);
		if (mat.matches()) {
			System.out.println("N�mero binario V�lido");
		} else {
			System.out.println("N�mero binario No V�lido");
		}
	}

	public void validaoctal() {// Opci�n 5 del men�
		sc = new Scanner(System.in);
		String octal;
		System.out.print(
				"Introduce n�mero octal: \n Recuerda que solo puede contener 0, 1, 2, 3, 4, 5, 6, 7 la cantidad que sea: ");
		octal = sc.next();
		Pattern pat = Pattern.compile("^[0-7]+$");
		Matcher mat = pat.matcher(octal);
		if (mat.matches()) {
			System.out.println("N�mero octal V�lido");
		} else {
			System.out.println("N�mero octal No V�lido");
		}
	}

	public void validaemail() {// Opci�n 6 del men�
		sc = new Scanner(System.in);
		String email;
		System.out.print("Introduce email: ");
		email = sc.nextLine();
		Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mat = pat.matcher(email);
		if (mat.find()) {
			System.out.println("Correo V�lido");
		} else {
			System.out.println("Correo No V�lido");
		}
	}

	public void validaisbn() {// Opci�n 7 del men�
		sc = new Scanner(System.in);
		String isbn;
		System.out.print(
				"Introduce ISBN de 13 d�gitos, siempre empieza en 978 o 979 \n(978-3-16-148410-0) sin guiones: ");
		isbn = sc.nextLine();
		Pattern pat = Pattern.compile("^(978|979)[0-9]{10}$");
		Matcher mat = pat.matcher(isbn);
		if (mat.matches()) {
			System.out.println("ISBN V�lido");
		} else {
			System.out.println("ISBN No V�lido");
		}
	}

	public void validatwiter() {// Opci�n 8 del men�
		sc = new Scanner(System.in);
		String twiter;
		System.out.print("Introduce twiter: \nEmpieza por @ y puede contener letras may�sculas y min�sculas,"
				+ "\n n�meros, guiones y guiones bajos:\n ");
		twiter = sc.nextLine();
		Pattern pat = Pattern.compile("^@[\\w-]{0,}$");
		Matcher mat = pat.matcher(twiter);
		if (mat.find()) {
			System.out.println("twiter V�lido");
		} else {
			System.out.println("twiter No V�lido");
		}
	}

	public void validahexa() {// Opci�n 9 del men�
		sc = new Scanner(System.in);
		String hexa;
		System.out.print(
				"Introduce n�mero hexadecimal: \n Recuerda que solo puede contener 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F la cantidad que sea: ");
		hexa = sc.nextLine();
		Pattern pat = Pattern.compile("^[0-9A-F]+$");
		Matcher mat = pat.matcher(hexa);
		if (mat.find()) {
			System.out.println("N�mero hexadecimal V�lido");
		} else {
			System.out.println("N�mero hexadecimal No V�lido");
		}
	}

	public static void main(String[] args) {

		Validar v = new Validar();

		boolean salir = true;
		sc = new Scanner(System.in);
		String opcion = "";
		do {
			System.out.println(
					"\nVarias validaciones con expresiones regulares:\n**********************************************");
			System.out.println("1. Validar n�mero entero");
			System.out.println("2. Validar n�mero entero positivo");
			System.out.println("3. Validar dni");
			System.out.println("4. Validar n�mero binario");
			System.out.println("5. Validar n�mero octal");
			System.out.println("6. Validar email");
			System.out.println("7. Validar ISBN");
			System.out.println("8. Validar Twiter");
			System.out.println("9. Validar n�mero hexadecimal");
			System.out.println("10. Salir del programa");
			opcion = sc.next();

			switch (opcion) {

			case "1":
				v.validaentero();
				break;
			case "2":
				v.validaenteropositivo();
				break;
			case "3":
				v.validadni();
				break;
			case "4":
				v.validabinario();
				break;
			case "5":
				v.validaoctal();
				break;
			case "6":
				v.validaemail();
				break;
			case "7":
				v.validaisbn();
				break;
			case "8":
				v.validatwiter();
				break;
			case "9":
				v.validahexa();
				break;
			case "10":
				salir = false;
				System.out.println("Has salido del programa, hasta pronto.");
				break;
			default:
				System.out.println("\n*****************\nOpci�n incorrecta\n*****************");
				break;
			}
		} while (salir);
	}
}
