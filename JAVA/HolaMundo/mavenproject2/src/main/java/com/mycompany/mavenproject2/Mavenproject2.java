

package com.mycompany.mavenproject2;

import java.util.Scanner;


public class Mavenproject2 {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo desde Java");
        
        
        int miVariable = 10;
        System.out.println(miVariable);
        
         //Var - inferenciaa de tipos de Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos intentando estudiar";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("miVariableEntera2 = " + miVariableEntera2);*/
        
        
        /*var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo+ ' ' + usuario;
        System.out.println(union);
        
        var a = 8;
        var b = 10;
        System.out.println(a + b);
        System.out.println(usuario + a + b);
        System.out.println(usuario +' '+ ( a + b));
        */
        
        /*var nombre = "Natalia";
        
        System.out.println("\n"+nombre);//\n Indica un salto de linea
        System.out.println("\t\t"+nombre);//tabulador para centrar
        System.out.println("\b"+nombre);//quita espacio delante
        System.out.println("\'"+nombre+"\'");*/
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre=");
        var usuario2 = entrada.nextLine();
        System.out.println("Escribe el titulo= ");
        var profesion2 = entrada.nextLine();
        System.out.println(profesion2 +' '+ usuario2);
        
        
    }
}
