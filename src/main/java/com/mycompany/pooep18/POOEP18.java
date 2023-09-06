/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep18;

import java.util.Scanner;
/**
 *
 * @author SantiaG0D
 */
public class POOEP18 {

    public static void main(String[] args) {
        System.out.println("Inserte codigo del empleado");
        Scanner sc = new Scanner(System.in);
        int idEmpleado = sc.nextInt();
        System.out.println("Inserte nombre del empleado");
        String nombre = sc.next();
        System.out.println("Inserte las horas trabajadas este mes");
        double horas = sc.nextDouble();
        System.out.println("Inserte el valor de las horas");
        double valorH = sc.nextDouble();
        System.out.println("Inserte el porcentaje de retencion de la fuente");
        double pRetencion = sc.nextDouble();
        double retencion = pRetencion/100;
        
        double sb = horas*valorH;
        double rf = sb*retencion;
        double sn = sb-rf;
        System.out.println("El código del empleado es: "+idEmpleado+" el nombre es: "+nombre+" el salario bruto es: "+sb+" el salario neto es: "+sn);
    }
}
