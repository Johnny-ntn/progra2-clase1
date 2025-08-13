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







    }
}
