import java.io.*;

/*
* Array del método main, que recibe los valores por medio de la pila
*
*
*/

class Arreglo
{
	 public static void main(String []ar)
	 {	
		int cant =  ar.length;
		System.out.println("Cantidad de parámetros : " + cant); // se pasan por la pila
		if(cant!=0)
			for(int i = 0; i < cant; i++ )
				System.out.print( "El argumento " + i + " es " + ar[i]+ ".\n");
		System.out.println("Hasta luego. ");
         }

}
