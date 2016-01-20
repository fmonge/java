/*
	Uso de: enum, switch, for, metodos
*/


import java.util.Scanner;
import java.io.*;

public class Enum
{
		
	public enum Dias
	{
		DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO
	};

	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		listar();
		Dias misDias;
		misDias = Dias.MIERCOLES;

		switch(misDias)
		{
			case DOMINGO:
				System.out.println("Día de descanso.");
				break;
			case LUNES:
				System.out.println("Lunes, no voy a trabajar...");
				break;
			case MARTES:
			case MIERCOLES:
			case JUEVES:
				System.out.println("¡Programar mas!.");
				break;
			case VIERNES:
			case SABADO:
				System.out.println("Fin de semana (mas tiempo para programar).");
				break;
			default:	
				System.out.println("¿Qué pasó? ¿Juernes?");
		}

				
	}

	public static void listar()
	{
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Días de la semana.");
		int contador = 0;
				
		for(Dias x: Dias.values()) //para recorrer un enum. values() nos dá el valor actual
			//System.out.println("\t" + contador++ + ". " + x); 
			System.out.println("\t" + x.ordinal() + ". " + x); 	// igual resultado = contador++
		System.out.println("\n\t");
	}		
	
}
