/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Robins Zuñiga
 */
public class CuentaJovenService {

    Scanner sc = new Scanner(System.in);
    Cuenta cj1 = new Cuenta();
    PersonaService p1 = new PersonaService();

    public void esTitularValido() {

        if (p1.p1.getEdad() > 17 && p1.p1.getEdad() < 26) {
            System.out.println("Creando Cuenta Joven");

        } else {
            System.out.println("No se puede crear cuenta joven");
        }

    }

    public void retirar() {

        System.out.println("Ingrese la cantidad a retirar: ");
        double retirar;

        retirar = sc.nextDouble();
        System.out.println("Su saldo es: " + (cj1.getCantidad() - retirar));

    }

}
