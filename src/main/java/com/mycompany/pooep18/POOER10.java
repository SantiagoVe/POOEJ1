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
public class POOER10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero de inscripcion");
        int ni = sc.nextInt();
        System.out.println("Escribe por favor tu nombre");
        String nombre = sc.next();
        System.out.println("Cuanto es tu patrimonio?");
        double pat = sc.nextDouble();
        System.out.println("Cual es su estrato social?");
        int est = sc.nextInt();
        
        if (pat>2000000 && est>3){
            double vM = (pat*0.03)+50000;
            System.out.println("Numero de inscripcion: "+ni);
            System.out.println("Nombres: "+nombre);
            System.out.println("Valor de matricula: "+vM);
        }
        else{
            System.out.println("Numero de inscripcion: "+ni);
            System.out.println("Nombres: "+nombre);
            System.out.println("Valor de matricula: "+ 50000);
        }
        
    }
}
