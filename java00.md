###### instalación de openjdk

[Java Conceptual Diagram](https://docs.oracle.com/javase/8/docs/ "Descripción del diagrama conceptual de Java")
<!-- https://docs.oracle.com/javase/8/docs/technotes/guides/desc_jdk_structure.html -->


## 0. Elementos de un programa en Java

### 0.1.0 Identificadores
Es una secuencia de caracteres: letras mayusculas y minúsculas, números, el símbolo $ y _. El primer carácter no puede ser un número.

##### Ejemplo:
	 suma1    contador_color   sumas      Sumas
	 $umas   catidad_total    puntero    tamaño_x

**Por buenas practica de programación se recomienda:**
1. **Variables en minúscula.**
2. **Constantes en mayúscula.**
3. **Métodos en minúscula.**
4. **Clases con el primer carácter en mayúscula.**


### 0.1.1 Palabras reservadas (*keyword* o *reserved word*)

Son palabras con alguna función o significado especial y no se pueden usar como identificador, objeto, clase o método.

##### [Palabras reservada de Java](puntocomnoesunlenguaje.blogspot.com/2012/04/identificadores-y-palabras-reservadas.html "Java: Identificadores y palabras reservadas")

	abstract     continue        for             new             switch
    assert       default         goto            package         synchronized
    boolean      do              if              private         this
    break        double          implements      protected       throw
    byte         else            import          public          throws
    case         enum            instanceof      return          transient
    catch        extends         int             short           try
    char         final           interface       static          void
    class        finally         long            strictfp        volatile
    const        float           native          super           while

True, false (lógicos) y null (nada/ninguno) son literales reservados

### 0.1.2 Signos de puntuación y separadores

	! % & * ( ) - * = { } ~ ^ |
    [ ] \ ; ´ _ < > ? , . / "

 Los separadores son espacios en blanco, tabulaciones y retornos de carro.

### 0.1.3 Paquete

Java agrupa las clases relacionadas o con propositos similatres en archivos llamados paquetes. Los de mallor importancia son java.applet, java.awt, java.io, java.lang y java.util


### 0.2.0 Tipos de datos en Java

El tipo de dato se refiere al valor que tiene una variable. Los diferentes tipos de datos representan valores escalares o individuales, *char* o *entero*. En Java se pueden crear nuevos tipos de datos (objetos). Los básicos son:

#####[Tipos primitivos:](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html "Primitive Data Types")
* Enteros: Números completos y sus opuestos (negativos)  ***int***.
	* Variantes: ***byte, short*** y ***long***.
* Reales: Números decimales: ***double*** y ***float***.
* Caracteres: ***Dígitos, simbolos, signos de puntuación*** y ***letras***.
* Boolean: ***true*** o ***false***.



| Tipo    | Ejemplo | Tamaño* 	| Rango						|
| :-----: | :-----: | :-----: 	| :--------------------- 	|
| char	  |  'F'    | 2		 	| '\0000' ... '\FFFF'		|
| byte 	  | -21		| 1		 	| -125 ... 127 				|
| short	  | 1024	| 2 		| -32,768 a 32,767 			|
| int 	  | 246841  | 4			|  -2,147,483,648 a 2,147,483,647 |
| long	  | 9995494 | 8			| -9,223,372,036,854,775,808 ... +9,223,372,036,854,775,807  |
| float   | 41.58F  | 4 		| +-1.40129846432481707e-45 a 3.40282346638528860e+38 |
| double  | 0.00045 | 8  		| +-4.94065645841246544e-324d to 1.79769313486231570e+308d |
| boolean | false 	| 1 bit		| true, false 				|
*En bytes

### 0.2.1 Void

El tipo de datos void en Java se utiliza para indicar que un método retorna nada.

#####Ejemplo:
```java
void acumular();
void ver();
void noRetornoNada();
```

### 0.2.2 Enum

El tipo de dato enumerado o enumeraciones los diferentes valores por medio de identificadores y son detenidos por el programador. *Enum* un tiene un número finito de elementos y valores nombrados. Ejemplo:

#####Ejemplo:
```java
enum Lenguajes { C, JAVA, LUA, LISP, PYTHON };
enum Notas { A, B, C, D, E, F };
```
De esta manera se define **Notas** como un tipo enumerado. A sus valores se les llama constantes de enumeración (*enum*). Luego de hacer esto se pueden declarar variables de este tipo:
```java
Lenguajes miLenguaje; // declaración de la variable
MiLenguaje = Lenguajes.JAVA: // asignación de valor
```
De esta manera solo se le podrán asignar los valores que queramos a una variable.

### 0.2.3 Conversión de tipos (*cast*)

Java permite el *casting* o **conversión explícita** de datos mediante un modelado de tipos:
```java
(tipoDeDato) expresión
```
Se evalúa la *expresión* y su resultado se trata como un *tipoDeDato*.

| Expresión     | Resultado  |
| :-----------: | :--------: |
| (int) (9.5)   |     9      |
| (int) 6.3     |     6      |
| (double) (34) |     34.0   |

##### También están las **conversiones implícitas**
##### Ejemplo:
```java
int x = 7;
double y = 4.0;
y = y + x; // antes de realizar la suma el valor de x de convierte a double
```
* Siempre que el tipo de dato a la derecha del = sea mayor que el del lado izquierdo hay una conversión implícita.
	* int -> long -> float -> double
* *Char, short, byte* se convierten en *int*.
*  Las constantes enteras se consideran *int*.
*  Las constantes reales se  consideran *double*.
	* float a = 3.0; // genera error. Lo correcto es float a = (float) 3.0.

### 0.2.4 Constantes

En Java existen 2 tipos constantes.
* Literales
* Declaradas


#### 0.2.4.1 Constantes literales
O simplemente constantes:
* Enteras
* De punto flotante
* Caracteres
* De cadena

##### Enteras:
* No usar signos de puntuación como el punto. Usar 314 en lugar de 3.14*
* Para usar un tipo *long* debe finalizar con la letra L. *314L*
* Para base octal debe iniciar por 0. 0472
* Para base hexadecimal debe iniciar por 0x. 0x13A

##### Reales:
Siempre tiene signo y representa aproximaciones:
*82.347;  24.e+4;  5.25E7;   0.45*
4.6E5 -> 460000
2.789E-3 -> 0.002789


##### [NaN](https://es.wikipedia.org/wiki/NaN "Not a Number") e infinito

Hay funciones matemáticas que no están definidas dentro del conjunto de los números reales. El resultado de estas no es un número o NaN:
```java
System.out.println("Log(-1.0) = " + Math.log(-1.0));
```
Da como resultado:
Log(-1.0) = NaN

Por otro lado con algunas funciones podemos obtener como resultado -∞ o -∞

```java
System.out.println("Log(0) = " + Math.log(0.0));
```
Da como resultado:
Log(0) = -infinito

##### Carácter:
Se pueden escribir simplemente como: 'F', 'a' o con su equivalente ASCII en octal '\105' también se pueden hacer con hexadecimal usado Unicode '\u04AC', ampliando la cantidad de caracteres. Algunos de los mas usados son las secuencias de escape. Donde **\** es el código o carácter de escape.
Las mas usadas son:

| Escape  | Función              |
| :-----: | :-----:              |
| '\n'    |  nueva linea         |
| '\r'    | retorno de carro     |
| '\t'    |  tabulación           |
| '\b'    | retroceso de espacio |
| '\f'    |  avance de página    |
| '\\'    |   \                  |
| '\''    |   '                  |
| '\"'    |   "                  |
| '\000'  |   número octal       |
| '\uhhhh'|   número hexadecimal |


Se pueden realizar sumas con caracteres:
```java
char letra;
letra = ('F' + 3)	// error
letra = (char) ('F' + 3); //correcto
```
*letra = ('F' + 3)* genera error por asignar un dato de 32b a uno de 16b.

##### Cadenas:
En Java las cadenas son objetos (**String**) definido en java.lang

#### 0.2.4.2 Constante *final*

Las variables o constantes declaradas como final no se pueden modificar en el programa,ya que hacerlo daría error. La forma de declararla *final* es:
```java
final int = MAX = 7;
final char SALIR = 'X';
```

***

### 0.3 Mas tipos de datos

### 0.3.1 Arreglos

Un [Arreglo](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Array.html 'Array') es una estructura de datos que nos permite guardar una cantidad de datos del mismo tipo

Para evita hacer cosa como esto se crean los arrglos:

```java
	String nombre1 = "Pedro";
    String nombre2 = "Pablo";
			.
			.
			.
	String nombreN = "Enesimo";
```

Se hace esto:

```java
	tipo[] variable = new tipo[tamaño];
```

<!--  fafafa  -->

### 0.3.2 Arreglos multudimensionales o matrices.
```java

    int[][]  matriz = new int[3][2];
    	o
	int[][]  matriz;
	matriz = new int[3][2]; int[][]

	matriz = {{1,2},{3,4},{5,6}};
```
