/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Robins Zuñiga
 */
public class PersonaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Persona p1 = new Persona();
    
    public void crearPersona() {
        
        System.out.println("Ingresa Nombre: ");
        p1.setNombre(sc.nextLine());
        
        System.out.println("\nIngrese edad: ");
        p1.setEdad(sc.nextInt());
        
        System.out.println("\nIngrese DNI: ");
        p1.setDni(sc.nextInt());
        
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("DNI: " + p1.getDni());
    }
    
    public void esMayorDeEdad() {
        if (p1.getEdad() > 17) {
            System.out.println("Es mayor de edad.");
            
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}
