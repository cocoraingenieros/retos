package views;
public class App {                               // public es el nivel de acceso 

    private String name;                        // String    va en mayuscula por que es una clase
    private int age;
    private char sexo;                          // char   es un tipo de dato que guarda unicamente un caracter
    private double estatura;                    //double  es un tipo de dato que define decimales
    private float peso;
    private boolean estadoCivil;


    public static void main(String[] args) throws Exception {   // main es un entry point
        System.out.println("Hello, World!");
        //                       tipos de datos y operadores
        // operadores aritmeticos
        int resultado1 = 12 + 14;
        String resultado2 = "hola miguel";
        double resultado3 = 25 / 3;
        int resultado4 = 98 - 38;
        float resultado5 = 25 * 125;
        int resultado6 = 21 % 5;
        System.out.println(resultado1);

        // operadores unarios                    ..... estos operadores permiten trabajar con un unico valor
        resultado1++;       // rersultado1 = resultado1 + 1
        System.out.println(resultado1);
        resultado1--;
        System.out.println(resultado1);
        resultado1 = -resultado1;
        System.out.println(resultado1);
        resultado1 = +resultado1;
        System.out.println(resultado1);

        // operadores logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        System.out.println(respuesta);
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
        respuesta = 12 < 5 && 4 > 1;       // && funciona como el and en python
        System.out.println(respuesta);
        respuesta = 14 < 25 || 1 > 5;      //    || funciona como el   or
        
        // operadores bit a bit
        //  &      funciona como un and, pero lo hace bit a bit
        //  ^      funciona como xor
        //  |       


        //                          estructuras de control

        if (respuesta) {
            // bloque de codigo
        }
        if (respuesta) {
            // bloque de cofigo si se cumple
        } else {
            // bleque de codigo si no se cumple
        }

    }
}
