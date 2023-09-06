/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooep18;
import java.util.Scanner;
/**
 *
 * @author SantiaG0D
 */
public class POOER12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte nombre del trabajador");
        String nombre = sc.next();
        System.out.println("Horas trabajadas");
        double horasT = sc.nextDouble();
        System.out.println("Valor de hora");
        double valorH = sc.nextDouble();
        if(horasT>40){
            double horasE = horasT-40;
            if(horasE>8){
                double horasEE = horasE-8;
                double salarioHorase =  (valorH*2)*8 + (valorH*3)*horasEE;
                System.out.println("El salario del trabajador: "+nombre+" es: "+(salarioHorase+(valorH*40)));
            }
            else{
                System.out.println("El salario del trabajador: "+nombre+" es: "+(valorH*40)+valorH*2*8);
            }
                    
                   
        }
        else{
            System.out.println("El salario del trabajador: "+nombre+" es: "+(valorH*40));
        }
        
    }
}
