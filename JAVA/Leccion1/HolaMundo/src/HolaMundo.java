
import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
       /* System.out.println("Hola Mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en Programación";
        System.out.println(miVariableCadena);
        */
       /*
       //Var - Inferencia de tipos en java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2= " + miVariableEntera2);
        System.out.println("miVariableCadena2= " + miVariableCadena2);
        //sout+tab
        //para ejecutar shift + f6 es la tecla para mayuscula
        //reglas para definir una variable en java
        
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        
      //Ejercicio Caracteres especiales en Java
      
        var nombre = "Natalia";
        System.out.println("\nNueva Linea: \n" + nombre);//Diagonal Inversa y letra n
        System.out.println("Tabulador: \t" + nombre);//tabulador un espacio para centrar
        System.out.println("Retroceso: \b\b" + nombre);//caracter para retroceso en caso que se encuentre muy a la derecha el texto
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");
        */
        /*
        //Clase scanner
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el Título");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);*/
        
        /*byte numEnteroByte = 126;
        System.out.println("Valor minimo del Byte: "+Byte.MIN_VALUE);
        System.out.println("Valor Maximo del Byte: "+ Byte.MAX_VALUE);*/
        /*byte numEnteroByte = (byte)129;
        System.out.println("Valor minimo del Byte: "+Byte.MIN_VALUE);//son clases byte y short 
        System.out.println("Valor Maximo del Byte: "+ Byte.MAX_VALUE);//siempre van con mayuscula*/
        /*byte numEnteroShort = 10;
        System.out.println("numEnteroShort= "+ numEnteroShort);
        System.out.println("Valor minimo del Short: "+Short.MIN_VALUE);
        System.out.println("Valor Maximo del Short: "+ Short.MAX_VALUE);
        
        int numEnteroInt = 10;
        System.out.println("numEnteroInt= "+ numEnteroInt);
        System.out.println("Valor minimo del Int: "+Integer.MIN_VALUE);
        System.out.println("Valor Maximo del Int: "+ Integer.MAX_VALUE);
 
        int numEnteroInt = (int)2147483648L;
        System.out.println("numEnteroInt= "+ numEnteroInt);
        System.out.println("Valor minimo del Int: "+Integer.MIN_VALUE);
        System.out.println("Valor Maximo del Int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 10;
        System.out.println("numEnteroLong= "+ numEnteroLong);
        System.out.println("Valor minimo del Long: "+Long.MIN_VALUE);//9223372036854775807L se agrega la L en caso de agregar mas numeros
        System.out.println("Valor Maximo del Long: "+ Long.MAX_VALUE);//Num mas largos en Java
        
       */
        
       /* float numFloat = 10.0F;
        System.out.println("numFloat= "+ numFloat);
        System.out.println("Valor minimo del float: "+Float.MIN_VALUE);//9223372036854775807L se agrega la L en caso de agregar mas numeros
        System.out.println("Valor Maximo del float: "+ Float.MAX_VALUE);//Num mas largos en Java
       
        double numDouble = 10;
        System.out.println("numDouble= "+ numDouble);
        System.out.println("Valor minimo del double: "+Double.MIN_VALUE);//9223372036854775807L se agrega la L en caso de agregar mas numeros
        System.out.println("Valor Maximo del double: "+ Double.MAX_VALUE);//Num mas largos en Java
        */
     
        /*
        //Inferencia de tipos var y tipos primitivos 
        var numEntero = 20; //las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = "+ numEntero);
        var numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);//con el punto se transforma en double
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        
/*        //Tipos Primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = "+miVariableChar);
         
        //Para ver una lista de unicode ponemos en Google List Unicode https://en.wikipedia.org/wiki/List_of_Unicode_characters
        //y podemos ver la lista de caracteres en la tabla.
        char varCaracter = '\u0024';
        System.out.println("varCaracter = "+ varCaracter);
        char varCaracterDecimal = 36;
        System.out.println("varCaracterDecimal = "+ varCaracterDecimal);
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = "+ varCaracterSimbolo);
       
    //Ahora cambiamos a variable el estilo char y lo que cambia es el decimal
    //porque toma como un numero comun y no de la tabla unicode.
    //Para que tome el tipo char se agrega a var varCaracterDecimal1 = (char)36;
        char varCaracter1 = '\u0024';
        System.out.println("varCaracter1 = "+ varCaracter1);
        char varCaracterDecimal1 = 36;
        System.out.println("varCaracterDecimal1 = "+ varCaracterDecimal1);
        char varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = "+ varCaracterSimbolo1);
       
    //En caso de cambiar a Entero lo soporta el tipo char porque char es de 16bits
//y el int es de 32bits

        int varEnteroChar= '$';//Indicamos a Java la asignacion con el codigo Unicode
        System.out.println("varEnteroChar = "+ varEnteroChar);
        int caracterChar = 'b';//Valor ddecimal del juego de codigos Unicode
        System.out.println("caracterChar = "+ caracterChar);
        */

       /* //Tipos primitivos tipos booleanos
        boolean varBool = true;
        System.out.println("varBool= "+varBool);
        
        if(varBool){
            System.out.println("La Bandera es Verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
      boolean varBool1 = false;
        System.out.println("varBool1= "+varBool1);
        
        if(varBool1){
            System.out.println("La Bandera es Verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
*/
       //Algoritmo: ¿Es mayor de edad?
       var edad = 15;//Literal tener presente la inferencia de tipos
       var adulto = edad >= 18;//Esta es una expresion booleana
       if(adulto){
                System.out.println("Eres mayor de edad");
       }else{
            System.out.println("Eres menor de edad");
                   
       }
       
        /*var numEntero = 20;
        System.out.println("numEntero: " + numEntero);
        var numFloat = 10.0;
        System.out.println("numFloat = " + numFloat);*/
        
        
        /*int num1 = 5, num2 = 4;
        //inferencia de tipos no se puede asignar varias 
      //variables en la misma linea
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma= "+solucion);
        
        solucion = num1 - num2;
        System.out.println("Solucion de la resta= "+solucion);
        
        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicacion: "+solucion);
        
        solucion = num1/num2;
        System.out.println("Solucion de la division: "+solucion);
        
        var solucion2= 3.4/num2;
        System.out.println("Solucion2 de la division= "+solucion2);
        
        solucion = num1%num2;
        System.out.println("solucion del resultado mod: "+solucion);
        
        if(num1 % 2 == 0){
            System.out.println("Es par");
        
        }else{
            System.out.println("Es impar");
        }
        }*/
        /*
        int varNum1=4, varNum2=4;
        int varNum3=varNum1+6 - varNum2;
        System.out.println("varNum3= "+varNum3);
        varNum1+=1;//Operador de Composicion
        System.out.println("varNum1 suma = "+varNum1);
        //- * / %
        varNum1-=1;//Operador de Composicion resta
        System.out.println("varNum1 resta= "+varNum1);
        varNum1*=1;//Operador de Composicion producto
        System.out.println("varNum1 producto = "+varNum1);
        varNum1/=1;//Operador de Composicion division
        System.out.println("varNum1 division = "+varNum1);
        varNum1%=1;//Operador de Composicion modulo
        System.out.println("varNum1 modulo = "+varNum1);
       
        //Operadores unarios
        var varA = 7;
        var varB = -varA;
        System.out.println("varA =" + varA);
        System.out.println("varB = " + varB);
        //Operador de negacion
        var varC = true;
        var varD = !varC;
        System.out.println("VarD = " + varD);

        //operadores unarios de incrmento: preincremento
        var varE = 9;
        var varF = ++varE;//primero se inc la variable y despues se usa su valor
        System.out.println("varE = " + varE);//se incrementa la unidad
        System.out.println("varF = " + varF);//va a sumar uno
        //postincremento el simbolo va despues de la variable
        var varG = 3;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores unarios de decremento
        //predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta en decremento
        System.out.println("varJ = " + varJ);

        //postdecremento
        var varK = 8;
        var varL = varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);//aqui va el decremento en 11
        System.out.println("varL = " + varL);

        //Operadores de igualdad
        var aNum = 5;
        var bNUm = 4;
        var cNum = (aNum == bNUm);
        System.out.println("cnum = " + cNum);
        var dNum = aNum != bNUm;
        System.out.println("dNum = " + dNum);
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        var fvar = cadenaA.equals(cadenaB);
        System.out.println("fvar = " + fvar);
        //Operadores relacionales
        var gVar = aNum > bNUm;
        System.out.println("gVar = " + gVar);
        if (aNum % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("impar");
        }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("es adulto");
        } else
            System.out.println("es menor de edad");

        //Operadores Condicionales
        var valorA = 7;
        var valorMinimo =0;
        var valorMaximo = 10;
        var respuesta = valorA>=0 && valorA<=10;

        if(respuesta){
            System.out.println("Esta dentro del rango establecido");
        }else{
            System.out.println("Esta fuera del rango establecido");
        }
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones||diaLibre){
            System.out.println("papa puede asistir al juego de su hijo");
        }else{
            System.out.println("papa no puede asistir al juego de su hijo");
        }
        //Operador Ternario
        var resultadoT = (5>4)?"Verdadero":"falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 7;
        resultadoT = (numeroT%2==0?"par":"impar");
        System.out.println("resultadoT"+resultadoT);    */   

    
        
           


/*public class Ejercicio1 
var entrada =  new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombre = entrada.nextLine();
        System.out.println("Digite el ID del libro: ");
        int id =Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precio =Double.parseDouble(entrada.nextLine());
        System.out.println("Indique si el envio es gratuito (true/false): ");
        boolean envio =Boolean.parseBoolean(entrada.nextLine());
        System.out.println("****************");
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+ id);
        System.out.println("Precio: "+precio);
        if (envio) {
            System.out.println("Envio: Gratuito");
        }else {
            System.out.println("Envio: El envio no es Gratutito");
        }*/
    
    
        /*var entrada =  new Scanner(System.in);
        System.out.println("Ingrese el salario por hora");
        double salario= Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese las horas trabajadas");
        int horas= Integer.parseInt(entrada.nextLine());
        double salarioAPagar= salario*horas;
        System.out.println("Trabajo: "+horas+" horas");
        System.out.println("Se paga por Hora: $"+salario);
        System.out.println("Se debera pagar: $"+salarioAPagar);*/
        /*var entrada =  new Scanner(System.in);
        System.out.println("Digite el alto del rectangulo: ");
        var alto= Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el ancho del rectangulo: ");
        var ancho= Integer.parseInt(entrada.nextLine());
        var area = alto * ancho;
        var perimetro = (alto + ancho) *2;
        System.out.println("El area del rectangulo es: "+ area);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
        */
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite otro numero: ");
        var num2 = Integer.parseInt(entrada.nextLine());
        System.out.println(num1>num2?"El mayor es: "+num1:"El mayor es: "+num2);
    */
        /*double nota1=0;
        double nota2=0;
        double nota3=0;
        double suma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las nota 1");
        nota1=Double.parseDouble(entrada.nextLine());
        System.out.println("Digite las nota 2");
        nota2=Double.parseDouble(entrada.nextLine());
        System.out.println("Digite las nota 3");
        nota3=Double.parseDouble(entrada.nextLine());
        suma = nota1+nota2+nota3;
        System.out.println("La suma de las notas son: "+suma);
        */
        /*double montoGuillermo=0;
        double montoLuis =0;
        double montoJuan =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el monto en USD que posee Guillermo");
        montoGuillermo = Double.parseDouble(entrada.nextLine());
        montoLuis = (montoGuillermo>0?(montoGuillermo / 2):0);
        montoJuan = (montoGuillermo+montoLuis>0?((montoLuis+montoGuillermo)/2):0);
        System.out.println("USD de Guillermo: $"+montoGuillermo);
        System.out.println("USD de Luis: $"+montoLuis);
        System.out.println("USD de Juan: $"+montoJuan);
        */
        
    
        /*int cantCarros=0;
        double porcenVenta=0;
        double precioCarro=0;
        double salarioPagar=0;
        double comision =0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite cantidad de carros vendidos: ");
        cantCarros= Integer.parseInt(entrada.nextLine());
        comision=cantCarros>0?cantCarros*150:0;
        System.out.print("Digite el precio del carro: $");
        precioCarro=Double.parseDouble(entrada.nextLine());
        porcenVenta=(precioCarro>0?((precioCarro*5)/100):0);
        porcenVenta=porcenVenta*(cantCarros>0?cantCarros:0);
        salarioPagar=SALARIO+porcenVenta+comision;
        System.out.println("Sueldo Basico           : $"+SALARIO);
        System.out.println("Bonificacion por ventas : $"+porcenVenta);
        System.out.println("Comision cant. Ventas   : $"+comision);
        System.out.println("El salario a pagar es de: $"+salarioPagar);   */ 
        
        //package Leccion2;



//public class Leccion2 {

        var condicion = true;
        if (condicion) {
            System.out.println("Condición Verdadera"); //Condicional simple
        }
        else{
            System.out.println("Condición Falsa");//Condicional doble
        }

        var numero = 2;
        var numeroTexto = "Número desconocido";
       if(numero == 1){
            numeroTexto = "Número uno";
        }
        else if(numero == 2){
            numeroTexto = "Número dos";
        }
        else if(numero == 3){
            numeroTexto = "Número tres";
        }
        else if(numero == 4){
            numeroTexto = "Número cuatro";
        }
        else{
            numeroTexto = "Número no encontrado";
        }
         System.out.println("numeroTexto = " + numeroTexto);

    Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número del 1 al 4: ");
        var num = Integer.parseInt(entrada.nextLine());
        var numeroT ="Valor desconocido";
        switch(numero){
            case 1:
                numeroTexto ="Número uno";
                break;
            case 2:
                numeroTexto ="Número dos";
                break;
            case 3:
                numeroTexto ="Número tres";
                break;
            case 4:
                numeroTexto ="Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        
        
        
        
    }

}
       
       

