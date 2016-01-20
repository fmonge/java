# 1. Operadores


### 1.1 Operadaores de aritméticos

| Operador | Uso     | Resultado |
| :------: | :-----: | :---------: |
| /        | a / b   | División: cociente    |
| *        | a * b   | Multiplicación  |
| %        | a % b   |  División: resto (modulo) |
| +        | a + b   |  Suma |
| -        | a - b   | Resta |



### 1.2 Operadaores de asignación

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


### 1.3 Operadaores de decremento e incremento

| Operador | Uso     | Resultado* |
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


### 1.4 Operadaores relacionales

### 1.5 Operadaores lógicos

### 1.6 Operadaores de bit
	&
    |
    ^ xor
    ~ comp a uno
    <<
    >>

### 1.7 Operadaores condicional
<!-- como lambda  -->

expr ? treu : false;




# 2. Estructuras de control

### 2.1 if - else

### 2.2 switch

### 2.3 while

### 2.4 for
		for each
        for (variables :  conjunto )


# 3 Mas tipos de datos

