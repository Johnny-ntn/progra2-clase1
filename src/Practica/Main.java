package Practica;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO 1:
            1) Indique cuales son los valores de las variables al finalizar cada uno de los
            siguientes segmentos de código JAVA, asumiendo que todas han sido
            declaradas como enteras.*/

/*
        int a = 2; a++; // 3
        System.out.println("Ej A): " + a);

 */


/*
        int a = 2;
        int b = a++;
        System.out.println("Ej B): "" + a + " " + b);
        // a = 3, b = 2, porque el ++ se aplica después de que se asigne 2 a b, entonces al correrlo a sí suma 3, y b 2

*/


/*
        int a = 2; // a = 3
        int b = ++a; // b = 3
        System.out.println("Ej C): A = " + a + ", B = " + b);

*/


/*
        int a = 2;
        int b = 1;
        System.out.println("Ej D): "b+=a); // 3

 */


/*
        int b = 1; b *= 5;
        System.out.println("Ej E): " + b); // 5

 */

/*
        int a = 2;
        int b = 0;
        b += --a + 5;
        System.out.println("Ej F): B = " + b); // 6

 */

/*
        int b = 2;
        int a = 0;
        a += b--;
        System.out.println("Ej G): A = " + a + ", B = " + b ); // A = 2, B = 1

 */

/*
        int a = 2;
        int b = 3;
        int c = 5;
        a++; // A = 3
        b += a; // B = 6
        c *= b; // C = 5*6 = 30
        b -= 3; // B = 3
        a %= 2; // A = 1
        c /= 5; // C = 6
        System.out.println("Ej H): A = " + a + ", B = " + b + ", C = " + c); // A = 1, B = 3, C = 6

 */

/*
        int a = 1;
        int b = 2;
        b++; // B = 3
        b = ++a; // B = 2, A = 2
        a *= 2; // A = 4
        b += a; // B = 6
        a = ++b + 2; // A = 9, B = 7
        System.out.println("Ej I): A = " + a + ", B = " + b);

 */


/*
        int a = 1;
        int b = 4;
        a++; // A = 2
        b += a; // B = 6
        a *= 4; // A = 8
        b -= a; // B = -2
        ++b; // B = -1
        a = ++b; // A = 0, B = 0
        b = --a + b; // B = -1, A = -1
        System.out.println("Ej J): A = " + a + ", B = " + b);
*/


        /* EJERCICIO 2:
        Indique cuales son los valores de las variables al finalizar cada uno de los
        siguientes segmentos de código
        JAVA, asumiendo que a y b se declararon como enteras y v de tipo boolean.
         */


        // A)
        /*int a = 1; int b = 2; boolean v =(a++<b);
        System.out.println(v); // es true, Si hubieras escrito ++a < b, el incremento sería antes de la comparación, y v sería false porque se evaluaría (2 < 2)*/

        // B)
        /*int a = 1; int b = 2; boolean v = (++a<b);
        System.out.println(v); // es false, porque el incremento es previo a la variable, por lo que a pasa a ser 2, que no es menor a b = 2*/

        // C)
        /*int a = 1; int b = 2; boolean v = (++a>=b);
        System.out.println(v); // es true, porque 2 = 2*/

        // D)
        /*int a = 1; boolean v = (a%2==0);
        System.out.println(v); // es false porque 1 / 2 deja un resto de 0.5, no 0*/

        // E)
        /*int a = 1; boolean v = (a != 1);
        System.out.println(v); // es false porque a = 1, no es distinto de 1*/

        // F)
        /*int a = 1; int b = 2; boolean v = (b++<10 && a == 1);
        System.out.println(v); // es true porque b es menor a 10 y a = 1*/

        // G)
        /*int a = 1; int b = 2; boolean v = (b==1 && a >= 1);
        System.out.println(v); // es false porque b no es igual a 1, pero a si es >= 1, pero como está el && es false*/

        // H)
        /*int a = 1; int b = 2; boolean v = (b<10 || a++ == 2);
        System.out.println(v);
        // es true porque b si es menor a 10, El operador || (OR lógico) en Java es evaluación cortocircuitada (short-circuit):
            //Si la primera condición ya es true, Java ni siquiera mira la segunda (a++ == 2).*/

        // I)
        /*int a = 1; int b = 2; boolean v = (--b<=1 || a <= 10);
        System.out.println(v); // es true porque --b es == 1, y al ser OR lógico cortocircuito al ser true la primera condición la 2da se ignora*/

        // J)
        /*int a = 1; int b = 2; boolean v = (a--==2 || b == 1);
        System.out.println(v); // es false porque ni a = 2 ni b = 1*/

        // K)
        /*int a = 1; int b = 2; boolean v = !(a==1 && b==1);
        System.out.println(v); // es true porque la condición (a==1 && b==1) es false, pero el ! dice que es distinto, osea que !false = true*/



        // EJERCICIO 3: Escriba un metodo en java que:


        // A) Reciba un número y determine si es par.
        /*int numero = 7;
        boolean esPar;

        if (numero%2 == 0) {
            esPar = true;
        } else {
            esPar = false;
        }
        System.out.println(esPar);*/


        // B) Reciba un número y determine si es múltiplo de 5 o 7
        /*int numero = 15;
        boolean multiploDeCinco = false;
        boolean multiploDeSiete = false;

        if (numero%5==0 && numero%7==0) {
            multiploDeCinco = true;
            multiploDeSiete = true;
        } else if (numero%5==0) {
            multiploDeCinco = true;
        } else if (numero%7==0) {
            multiploDeSiete = true;
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 5 o 7");
        }
        System.out.println("Es múltiplo de 5? " + multiploDeCinco + ". Es múltiplo de 7? " + multiploDeSiete);*/


        // C) Reciba dos números y retorne el mayor de ellos.
        /*int numeroUno = 1;
        int numeroDos = 2;

        if (numeroUno > numeroDos) {
            System.out.println("numeroUno es mayor");
        } else if (numeroDos > numeroUno) {
            System.out.println("numeroDos es mayor");
        } else {
            System.out.println("numeroUno y numeroDos son iguales");
        }*/


        // D) Reciba tres números y retorne el mayor de los tres.
        /*int numeroUno = 14;
        int numeroDos = 22;
        int numeroTres = 32;

        if (numeroUno > numeroDos && numeroUno > numeroTres) {
            System.out.println("numeroUno es el mayor");
        } else if (numeroDos > numeroUno && numeroDos > numeroTres) {
            System.out.println("numeroDos es el mayor");
        } else {
            System.out.println("numeroTres es el mayor");
        } // no tiene en cuenta si dos valores son iguales*/


        /*E) Reciba un número entre 0 y 10, y si el número está entre 0 y 4 muestre "desaprobado"
            si está entre 5 y 6 muestre "suspenso", y si es mayor que 6 muestre "aprobado".*/
        /*int nota = 8;

        if (nota < 0 || nota > 10) {
            System.out.println("Nota ingresada inválida");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("desaprobado");
        } else if (nota == 5 || nota == 6) {
            System.out.println("suspenso");
        } else {
            System.out.println("aprobado");
        }*/


        // F) Muestre por pantalla todos los números entre 0 y 100.
        /*int contador = 0;
        while (contador <= 100) {
            if (contador < 100) {
                System.out.print(contador + ", ");
            } else {
                System.out.print(contador); // último número sin coma
            }
            contador++;
        } // Código optimizado para que todos los números salgan horizontalmente por consola*/


        // G) Reciba un número N, y muestre por pantalla todos los enteros entre 0 y N que sean pares.
           /* int numeroN = 33;
            int contador = 0;
            while (contador <= numeroN) {
                if (contador%2==0) {
                    System.out.print(contador + " ");
                }
                contador++;
            }*/


        // H) Reciba un número N, y retorne la sumatoria desde 0 a N.
        /*int numeroN = 5;
        int contador = 0;
        int suma = 0;

        while (contador <= numeroN) {
            suma += contador;
            contador++;
        }
        System.out.println(suma);*/


        // I) Reciba un número N, y retorne la suma de sus dígitos.
        /*int numeroN = 156;
        int sumaDigitos = 0;
        int numeroN_aux = numeroN;

        while (numeroN > 0) {
            sumaDigitos += (numeroN%10);
            numeroN /= 10;
        }
        System.out.println("La suma de los dígitos de " + numeroN_aux + " es: " + sumaDigitos);*/


        // J) Determine si, dado un número N = dm, dm-1 , ..., dl y un dígito d, d = di para 1 <= i <= m
        // QUE T_T ????



        // K) Determine si un número dado es primo.
        /*int numeroDado = 7;
        int contador = 1;
        int contadorDiv = 0;

        while (contador <= numeroDado) {
            if (numeroDado % contador == 0) {
                contadorDiv++;
            }
            contador++;
        }
        if (contadorDiv == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }*/


        /*L) Determine si un número dado es perfecto; un número es perfecto si la suma de los divisores del número
        /incluyendo al 1 y excluyendo al número) es igual al número.
        Ej: suma de divisores de 6 --> 1 + 2 + 3 = 6 --> es perfecto*/
        int numeroDado = 28;
        int contador = 1;
        int sumaDivisores = 0;

        while (contador < numeroDado) {
            if (numeroDado % contador == 0) {
                sumaDivisores += contador;
            }
            contador++;
        }
        if (sumaDivisores == numeroDado) {
            System.out.println("El número dado es perfecto");
        } else {
            System.out.println("El número dado no es perfecto");
        }


    }
}
