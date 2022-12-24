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
public class CuentaService {

    Scanner sc = new Scanner(System.in);
    Cuenta c1 = new Cuenta();

    public double ingresar() {
        System.out.println("Ingrese cantidad:");
        c1.setCantidad(sc.nextDouble());
        if (c1.getCantidad() < 0) {
            
        } else {
            
        }

        return 0;
    }

    public double retirar() {

        System.out.println("Ingrese cnatidad a retirar: ");
        double retirar;
        retirar = sc.nextDouble();
        System.out.println("Su saldo es: " + (c1.getCantidad() - retirar));
        return 0;
    }
}
