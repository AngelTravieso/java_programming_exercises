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
    
    
    
    
    
    
    
}
