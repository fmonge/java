# 2. Operadores


## 2.1 Operadaores de aritméticos

| Operador | Uso     | Resultado |
| :------: | :-----: | :---------: |
| /        | a / b   | División: cociente    |
| *        | a * b   | Multiplicación  |
| %        | a % b   |  División: resto (modulo) |
| +        | a + b   |  Suma |
| -        | a - b   | Resta |



## 2.1.1 Operadaores de asignación

| Operador | Uso     | Resultado* |
| :------: | :-----: | :---------: |
| =        | a = b   | a es igual que b |
| /=       | a /= b  | División cociente    |
| *=       | a *= b  | Multiplicación  |
| %=       | a %= b  |  División resto (modulo) |
| +=       | a += b  |  Suma |
| -=       | a -= b  | Resta |

*El resultado de estas operaciónes quedan en el primer operando (en a).

##### Ejemplo

```java
	int a = 5;
	int b = 10;
	int c = 7;
	int d, e;
	d = a + c; // ~ d = 5 + 7 ~ d = 12
    d +=  8;   // ~ d = d + 8 ~ d = 12 + 8 ~ d = 20
    e = d % a  // ~ e = 20 % 5 ~ e = 0
    d =  ((c - a) * 4 + 1) % 2 // d = 1
```
Los paréntesis se usan para asociar y dar prioridad. Las expreciones se evaluan de izquierda a derecha. Con este orden de prioridad: ( ), / y *, %, + y -.


## 2.1.2 Operadaores de decremento e incremento

| Operador | Uso     | Resultado   |
| :------: | :-----: | :---------: |
| --       | a--     | Resta 1 despues de ejecutar la linea |
| ++       | a++     | Suma 1 despues de ejecutar la linea  |
| --       | --a     | Resta 1 antes de ejecutar la linea   |
| ++       | ++a     | Suma 1 antes de ejecutar la linea    |

```java
	int a = 5;
    int b = a++; 	// b = 5;
    int c = 0;
    c = a++ - 2;	// c = 3
    b = --a;
    a -= b++ - --a;
```
¿Cuál es el valor de de a?

```java
	int a[] = {0, 1, 2, 3};
	int i = 2;
	int j = i++;
	int k = --i;
	i = a[k++];
```
¿Cuál es el valor de de i?


## 2.1.3 Operadores relacionales



| Operador | Uso     | Significado   |
| :------: | :-----: | :---------: |
| <        | a < b   | a Menor que b |
| >        | a > b   | Mayor que |
| <=       | a <= b  | Menor o igual que  |
| >=       | a >= b  | Mayot o igual que |
| ==       | a == b  | Igual que |
| !=       | a == b  | a Diferente que b|

Estas expreciónes retorna un *boolean, true *o* false*.

##### Ejemplos
```java
	boolean a;
	a = 's' == 'S'; //  El resultado de esta expreción es FALSE
    a = 5 >= 4;  // TRUE
    
```
Normalmente estas expreciónes son usadas con las estructuras de control como *if, while *y* for*.0

## 2.1.4 Operadores lógicos


| Operador | Nombre  | Uso     |
| :------: | :-----: | :-----: |
| !        | not     |  !a     |
| ^        | xor     |  a ^ b  |
| &&       | and     |  a && b |
| ll       | or      |  a ll b | 

Consultar [Tablas de verdad.](https://es.wikipedia.org/wiki/Conectiva_l%C3%B3gica#Lenguajes_formales "Conectiva lógica. Wikipedia")
#####Ejemplos
```java
	if(!(a != c) && (c ==  d)) {  ···  }
    while((x > 8) ^ (6 == y) ) {  ···  }
```


## 2.1.5 Operadores de bit

| Operador | Nombre           | Uso     |
|:--------:|:---------------:|:------:|
| !        | not             | no lógico|
| &        | and             | y lógico|
| l        | or              | o lógico|
| ^        | xor             | xor lógico |
| ~        | completo a uno  | completo a uno |
| <<       | shift left      | Desplazamiento lógico hacia la izquierda |
| >>       | shift rigth     | Desplazamiento lógico hacia la derecha |


Consultar  [operadores de bit](https://es.wikipedia.org/wiki/Operador_a_nivel_de_bits "Operadores a nivel de de bit. Wikipedia")

## 2.1.6 Operador condicional
<!-- como lambda en python  -->

Es un operador ternario lo que significa que requiere de tres expreciones. Una condición (verdadera o false) y dos resultados:

	expr ? exprT : exprF;
Se evalua *expr*, si su resuldato es *TRUE* se ejecuta exprT en caso contrio se ejecuta exprF.

##### Ejemplo
```java
	x > 5? x % 5 : x * 2; // si x es mayor que 5 se ejecuta la operación x % 5.
    System.out.println( vidas > 0 ? "Ganas." : "Pierdes." );
```
