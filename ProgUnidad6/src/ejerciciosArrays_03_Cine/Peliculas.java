package ejerciciosArrays_03_Cine;

import java.util.Scanner;

public class Peliculas {
	/**
	 * Practicando con Arrays Pel�culas
	 * 
	 * @author Robert G
	 */
	private int a�o;
	private String director;
	private String genero;
	private String nombre;

	public Peliculas(int a�o, String director, String genero, String nombre) {
		super();
		this.a�o = a�o;
		this.director = director;
		this.genero = genero;
		this.nombre = nombre;
	}

	public Peliculas() {
		super();
		this.a�o = 0;
		this.director = "";
		this.genero = "";
		this.nombre = "";
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "pelicula [a�o=" + a�o + ", director=" + director + ", genero=" + genero + ", nombre=" + nombre + "]";
	}

	public String mostrarPelicula() {
		return "El nombre de la pel�cula es " + nombre + " , del a�o " + a�o + ", del genero " + genero
				+ " y del director " + director;
	}

	@SuppressWarnings("resource")
	public static Peliculas altaPelicula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la pelicula");
		String n = sc.nextLine().toUpperCase();
		System.out.println("Introduce el g�nero de la pel�cula");
		String g = sc.nextLine().toUpperCase();
		System.out.println("Introduce el director de la pel�cula");
		String d = sc.nextLine().toUpperCase();

		int a�o = 0;

		boolean correcto = true;
		while (correcto) {

			try {
				System.out.println("Introduce el a�o de la pelicula");
				a�o = sc.nextInt();
				correcto = false;
			} catch (Exception e) {
				System.out.println("El a�o debe ser un n�mero");
			}
		}
		// System.out.println("pel�cula "+n+" g�nero "+g+" a�o "+a�o+" director"+d);
		Peliculas p = new Peliculas(a�o, d, g, n); // Creamos el objeto p

		return p;
	}
}
