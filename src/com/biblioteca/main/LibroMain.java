package com.biblioteca.main;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import com.biblioteca.Usuario;

public class LibroMain {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();

		Libro libro1 = new Libro(
				"JJ BENITEZ",
				"Caballo de Troya",
				"Aventura",
				2010,
				25.50
		);

		Libro libro2 = new Libro(
				"J.K. ROWLING",
				"Harry Potter y la piedra filosofal",
				"Fantasia",
				1997,
				30.00
		);

		Libro libro3 = new Libro(
				"GABRIEL GARCIA MARQUEZ",
				"Cien años de soledad",
				"Novela",
				1967,
				20.00
		);

		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);

		System.out.println("LIBROS DE LA BIBLIOTECA");
		System.out.println(biblioteca.getLibros());

		Usuario usuario1 = new Usuario(
				"Juan",
				"Perez",
				"1714616123",
				1
		);

		System.out.println("USUARIO");
		System.out.println(usuario1);

		System.out.println("PRESTAMO DE LIBRO");
		biblioteca.prestarLibro(libro1, usuario1);

		System.out.println(usuario1);

		System.out.println("LIBROS DISPONIBLES");
		biblioteca.mostrarLibrosDisponibles();
	}
}