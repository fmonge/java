
## 1. Estructura de un programa en Java

```java
// comentario
/* otro comentario */
/*
	comento
    comento
    comento
*/

import java.io.* // Archivo de clases de E/S
//java.io contiene clases y objetos relativos a entrada y salida de datos
// el se utiliza para importar todo el contenido de java.io*

public class nombreDelPrograma	// Nombre de la clase principal
{
	public static void main(String []ar)	// Método inicial del programa,
    										// Java exige esta sintaxis
    {   									// main, nombre del método
    	...		// Declaraciones locales
    	...		// Sentencias
    }
    ...
    static tipo foo(...) // Otro método dentro de la clase "nombreDelPrograma"
    { // abre bloque
    	...
    } // cierra bloque
}

```
Solo debe existir un método *main*. En Java este método se debe declarar como *public static void*. 


#### HolaMundo.java

```java
// Hola mundo en Java :)

import java.io.*;

class HolaMundo
{
	public static void main(String []ar)
    {
    	System.out.println("Hola mundo\n"); // Envía el mensaje "Hola mundo"
        // a la salida estándar, la pantalla
    }
}

```
El nombre del archivo que contiene un programa en Java debe tener como nombre el de la clase principal que contiene al main y la extensión **java**. En este caso el archivo debería llamarse: **holamundo.java**.

***
### 1.1.1 Declaración *import*


En java, las clases se agrupan en *[packages](https://es.wikipedia.org/wiki/Paquete_Java "paquetes")* definidos por grupos temáticos o utilerías que se encuentran almacenadas en disco bajo el mismo nombre.

Sintaxis general para la declaración *import*
```java
	import nombre_del_paquete.nombre_de_la_clase;
```
##### Ejemplo:
```java
 	import java.util.Math;
	import java.util.Date;
	import java.awt.Graphics;
```


***
### 1.1.2 Declaración de clases


Los programas en Java contienen al menos una clase. La que contiene al método *main*. Las clases inician generalmente por una palabra reservada indicando su visibilidad o acceso. Seguido de la palabra *class*, \{, el nombre de la misma, variables, métodos y \}.

##### Ejemplo:

Clase Potencia
```java
class Potencia
{
	int n, p;
    public static void main(String [] ar)
    {
    	int e;
    	int n, p;
    	n = 8;
    	p = e = 6;

	    for(int r = 1; p > 0; p--)
	    	r = r * n;
	    System.out.println("Potencia de " + n + "^" + e + " = " + r);
    }
} // termina la declaración de la clase Potencia

```

Clase Sumatoria
```java
class Sumatoria
{
	int a, b;   // variables de la clase
    public int sumar() //método
    {
    	int c, d;
        a = 71;
        b = c = 5
        return a + b + c + d;
    }
    ...
}
```
En este ejemplo las variables **a** y **b** (variables globales) pueden ser usadas en cualquier método de la clase Sumatoria. En cambio **c** y **d** (variables locales) solo "existen" en el método sumar. Solo este las puede usar. 

***
### 1.1.3 Métodos definidos por el programador

Estos métodos se "llaman" dentro de la clase donde se definen, se llaman por su nombre y con los parámetros del método, si los tuviera. Al llamar un método su código se ejecuta. 
Si la llamada es desde un objeto de la clase, se llama al método precedido del objeto y el selector **punto**.

##### Ejemplo:

```java
Sumatoria sr = new Sumatoria();
sr.sumar();
```

Estructura general de un método
```java
tipo_de_retorno nombreMetodo (parámetros_que_recibe)
{
	// cuerpo del método:
	...			// Declaraciones locales
	...			// Sentencias
    return ...	// expresión de retorno
}
```
**tipo_de_retorno** *el tipo de dato o void que retorna*
**parámetros_que_recibe** argumentos/parámetros  o void que recibe el método

```java
class Probar
{
	public static void main(String [] ar)
    {
    	double f;
        f = calcula();
        mostrar(f);
    }
    static double calcula()
    {
    	double pi = 3.14159;
        double x = pi / 4.0;
        return x * Math.sin(x) + 0.5;
    }
    static void mostrar(double r)
    {
    	System.out.println("Valor del método: " + r);
    }
}
```
***
### 1.2 Entrada y salida de datos.

Leer y escribir en

#### 1.2.1  Salida: *system.out*

System.out hace referencia al un objeto de [*PrintStream*](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html " Class PrintStream "). Los métodos mas usados son:

* *print()*		transfiere un [buffer](https://es.wikipedia.org/wiki/B%C3%BAfer_de_datos "buffer de datos (informática)") a la pantalla.
* *println()*   transfiere un buffer a la pantalla y un fin de linea al final.
* *flush()*     un buffer se imprime en pantalla.

##### Ejemplos
```java
	System.out.println("Hola mundo de Java");
    System.out.print("Hola mundo de Java\n");
```
También se puede hacer al estilo de C:

* [*printf()*](http://www.java2s.com/Tutorial/Java/0120__Development/0200__printf-Method.htm "printf Method « Development « Java Tutorial")

```java
	System.out.printf("");
    System.out.printf("");
```

#### 1.2.1  Entrada: *system.in*

System hace referencia a un objeto de [*BufferedInputStream*](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedInputStream.html "BufferedInputStream") en *in*. Se asocia al stream de entrada estándar (el teclado). Y lo hace carácter por carácter. El método utilizado es *read()*.
##### Ejemplos
```java
	char x;
    x = System.in.read();
```
##### Para leer cadenas:
1.  Se utiliza la clase [*InputStreamReader*](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html). Creamos un objeto de esta clase inicializado con System.in
2. Usamos este objeto (el de*InputStreamReader*) para inicializar otro de la clase [*BufferedReader*](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html "Class BufferedReader").
3. Este nuevo objeto nos permite leer del teclado, en este caso una linea.

```java
	String lectura;
	InputStreamReader en = new InputStreamReader(System.in); // 1
    BufferedReader entrada = BufferedReader(en);  // 2
    System.out.println("Digite una linea: ");
    lectura = entrada.readLine();	// 3
    System.out.println("El texto ingresado es: " + lectura);
```
Esto se puede representar en una linea.

```java
	BufferedReader entrada = BufferedReader(new InputStreamReader(System.in)); //6 1 y 2
```

#### 1.2.2  Entrada: clase *Scanner*

Para facitar la lectura de datos se crea la clase [*Scanner*](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html "Class Scanner"), que a su vez se enlaza con la clase System.in. La clase *Scanner* se define el paquete java.util (utilerias.4)

1. Como Scanner está en el paquete java.util debemos importarlo.
2. Inicializamos un objeto *Scanner* pasando el objeto System.in como parametro .
3. Podemos usaro los métodos de lectura de esta clase: *nextInt, nextDouble y next, respectivamente para leer un int, un double y una palabra.*
```java
	import java.util.Scanner;
	int entero;
    String palabra;
	Scanner entrada = new Scanner(System.in) // 2
    entero = entrada.nextInt(); // 3
    palabra = entrada.next();  //3
```




# Tarea # 1

Hacer un programa en Java que lea los datos de una persona. String: Nombre, apellido. Int: edad. Long: cédula. Bool: ¿Es progrmador?: Enum: ColorOjos, ColorPelo. Imprimir en pantalla estos datos con un método (imprimirInfo) que retorne 1. Hacer un método simple que escriba si el método imprimirInfo fue exito (si retorna 1).


Para compilar un programa de Java, hacer (en la terminal):

* javac programa.java
* java Programa

