package exercises;

import java.util.Scanner;

public class Programming {
    
    Scanner console = new Scanner(System.in);
    
    // 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
    public void program1() {
   
        System.out.println("Escribe tu nombre por favor: ");
        
        // Escribir en consola
        String name = console.nextLine();
        
        // Imprimir respuesta
        System.out.println(String.format("Hello \n%s", name));
        
    }
    
    // 2. Write a Java program to print the sum of two numbers.
    public void program2() {
        
        System.out.println("Suma de numeros");
        
        // Pedir primer numero
        System.out.print("Ingrese el primer numero: ");
        
        double num1 = Double.parseDouble(console.nextLine());
        
        // Pedir segundo numero
        System.out.print("Ingrese el segundo numero: ");
        
        // Parsear a double (la consola devuelve un string)
        double num2 = Double.parseDouble(console.nextLine());
        
        // Mostrar resultado de suma
        System.out.println(String.format("La suma es: %s", (num1 + num2) ));
        
    }
    
    
    // 3. Write a Java program to divide two numbers and print on the screen.
    public void program3() {
        
        System.out.println("Division de numeros: ");
        System.out.print("Ingrese el primer numero: ");
        
        while(!console.hasNextDouble()) {
            System.out.println("Ingresa un numero valido");
            System.out.print("Ingrese el primer numero: ");
            console.nextLine();
        }
        
        double num1 = Double.parseDouble(console.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        
        while(!console.hasNextDouble()) {
            System.out.println("Ingresa un numero valido");
            System.out.print("Ingrese el segundo numero: ");
            console.nextLine();
        }
        
        double num2 = Double.parseDouble(console.nextLine());
        
        System.out.println(String.format("La division es: %s", ( num1 / num2) ));
        
        
    }
    
    
    // 4. Write a Java program to print the result of the following operations.
    
    /*
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3 
    */
    public void program4() {
       
           System.out.println(String.format("a) -5 + 8 * 6: %s", ( -5 + 8 * 6) ));
           System.out.println("b) ( 55 + 9 ) % 9: " + ( 55 + 9 ) % 9 );
           System.out.println("c) 20 + -3 * 5 / 8: " + ( 20 + -3 * 5 / 8) );
           System.out.println("d) 5 + 15 / 3 * 2 - 8 % 3: " + (5 + 15 / 3 * 2 - 8 % 3) );
        
    }
    
    // 5.  Write a Java program that takes two numbers as input and display the product of two numbers
    public void program5() {
     
        System.out.println("Multiplicacion");
        
        System.out.print("Ingrese el primer numero: ");
        
        while(!console.hasNextDouble()) {
            System.out.println("Ingrese un numero valido");
            System.out.print("Ingrese el primer numero: ");
            console.next();
        }
        
        double num1 = Double.parseDouble(console.next());
        
        System.out.print("Ingrese el segundo numero: ");
        
        while(!console.hasNextDouble()) {
            System.out.println("Ingrese un numero valido");
            System.out.print("Ingrese el segundo numero: ");
            console.next();
        }
        
        double num2 = Double.parseDouble(console.next());
        
        System.out.println(String.format("La multiplicacion es: %s", (num1 * num2) ));
        
        
        
        
    }
    
    
    
}
