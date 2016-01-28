
# 3 Estructuras de control

Determinan el flujo de un progroma. Con un punto de entra eligiendo entre unos o mas puntos de salida. Todas las estrucuturas vistas en este capítulo se pueden anidar. Es decir escribir unas dentro de otras.

## 3.1 if - else

##### Sintaxis:
``` java
	// if
	if(expreción_A)
	{
		// Si expreción_A es TRUE, se ejecuta este segmento de código.
        ···
	}
	// Continua el programa normalmente.
    ···
    // if - else
    if(expreción_B)
	{
		// Si expreción_B es TRUE, se ejecuta este segmento de código.
        ···
	}
    else
    {
    	// Si expreción_B es FALSE, se ejecuta este segmento de código.
        ···
    }
```
##### Ejmplos
```java
	int numero;
    InputStreamReader en = new InputStreamReader(System.in);
    BufferedReader entrada = BufferedReader(en);
    System.out.println("Digite un número: ");
    numero = entrada.nextInt();

	if(numero >= 10)
	{
		System.out.println(" El número ingresado es mayor a 10");
	}
    else
    {
    	if(numero == 10)
        	System.out.println(" El número ingresado es igual a 10");
		else
			System.out.println(" El número ingresado es menor a 10");
        /* En este caso no requiere poner los {corchetes} para delimitar
        	el segmento puesto que son de una solo linea. */
    }
```

## 3.2 Switch

Se utiliza para elegir entre varias opciones. La elecciones se hace en base una variable simple. Las vatialbes que se pueden avaluar son unicamente las de tipo *int, char y enum*. La sentencia *break* se utiliza para terminar el buble actual. El caso *default* es usado cuando ninguno de los casos anteriores fue seleccionado.


##### Ejmplos

```java
	···
    int num = entrada.nextInt();

	switch (num)
    {
    case 1:
    	System.out.println("A ingresado al mundo 1. La rueda de tiempo.");
        laRueda();	// llamada al método laRueda
        break;	// Para que no se ejecute el siguiente case. Termina el switch
	case 2:
    	System.out.println("A ingresado al mundo 2. Las arenas del tiempo.");
        lasArenas();
        break;
	case 3:
        if(!(horasProgramado >= 100));
			System.out.println("No puede ingresar al mundo 3. Debes programar mas");
        else
        {
        	System.out.println("A ingresado al mundo 3. La bandera del pirata.");
            pirata();
        }
        break;
        default:
        	System.out.println("Este mundo no exite, prográmalo tú.");
    }

    letra = entrada.readLine();
    switch (letra)
	{
    	case a: case A:
        case e: case E:
        case i: case I:
        case o: case U:
        case u: case O:
        	System.out.println("A digitado una vocal.");
            breack;
       default:
        	System.out.println(" A digitado una consonante.");
    }
```

## 3.3 while

El *while y el for* repiten cero o más veces una segmento de código delimitado por corchetes, al igual que en el *if-else, y switch*. Cada iteración del segmento de código se llama una iteracíon.

La cantidad de interaciones depende de una condición (expreción). El bucle se ejecuta mientras la condición sea *TRUE*, si es *FALSE* este se detiene (no se ejecuta el segmento del while) y continúa el programa normalmente. Al igual que el *switch* se puede utilizar la sentencia *break* para interrunpir la ejecución del bucle.Tambien se pueden poner otras estructuras de control anidadas.

##### Ejmplos

```java
	···
    int i;
    i = 100;
	System.out.println("Números impares:")
	while( i != 0 )
    {
    	if(cont % 2 != 0)
    		System.out.println("Impar: " + i--)
    }
```

También exiten el bucle *do*, En donde se ejecuta al menos una vez el segmento de código.

##### Sintaxis do-while
```java
	do
    {
	...
    // segmento de código, se ejecuta al menos una vez
    ...
    }
	while(expreción) // condición de parada.
```

## 3.4 for

##### Sintaxis do-while

```java
	for (inicialización_de_variables ; condición_de_parada; incremento/decremento)
    {
    //	segmeto bucle
    }
```

**inicialización_de_variables:** Se créan la(s) varible(s) de control. También se pueden crear antes del *for*.
**condición_de_parada:** Contiene una exprecíon, si es verdadera se ejecuta el segmento de código. Por lo general se utiliza la(s) varible(s) de control creadas.
**incremento/decremento:** Incrementa o decrementa la(s) varible(s) de control.

##### Ejemplo:
```java
	System.out.println("Números impares:")
	for (int i = 100; i>=0; i--)
    	if(i % 2 != 0)
    			System.out.println("Impar: " + i)
```

<!--
		for each
        for (variables :  conjunto )
-->

