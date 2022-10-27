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
    
    
    
    
    
    
    
}
