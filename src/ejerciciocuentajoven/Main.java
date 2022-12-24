/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocuentajoven;

import Service.CuentaJovenService;
import Service.CuentaService;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Robins Zuñiga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PersonaService p1 = new PersonaService();
        CuentaService c1 = new CuentaService();
        CuentaJovenService cj1 = new CuentaJovenService();

        System.out.println("Bienvenido a Banco Real");

        int opcion;
        do {
            System.out.println("\n------ Menu------");
            System.out.println("1) Crear usuario");
            System.out.println("2) Cuenta");
            System.out.println("3) Crear cuenta joven");
            System.out.println("4) Salir");

            System.out.print("\nElije Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n[     Creando usuario     ]");
                    p1.crearPersona();
                    p1.mostrar();
                    p1.esMayorDeEdad();
                    break;

                case 2:
                    if (p1.p1.getEdad() < 18) {
                        System.out.println("[   No se puede crear cuenta   ]");

                    } else {
                        int opcionCuenta;
                        do {
                            System.out.println("Creando cuenta.");

                            System.out.println("Elige opcion:");
                            System.out.println("1) Ingresar saldo.");
                            System.out.println("2) retirar saldo.");

                            opcionCuenta = sc.nextInt();
                            switch (opcionCuenta) {
                                case 1:
                                    c1.ingresar();
                                    
                                case 2:
                                    c1.retirar();
                            }
                        } while (opcionCuenta > 4);
                    }
                    break;

                case 3:
                    if (p1.p1.getEdad() > 17 && p1.p1.getEdad() < 26) {
                        System.out.println("Creando cuenta joven.");
                        cj1.esTitularValido();
                        c1.retirar();
                    } else {
                        System.out.println("\n[   No se puede crear cuenta joven   ]");
                        break;
                    }

                default: {
                    System.out.println("Saliendo del menu");
                    break;
                }
            }

        } while (opcion != 4);

    }

}
