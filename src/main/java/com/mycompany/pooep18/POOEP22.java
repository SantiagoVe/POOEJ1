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
public class POOEP22 {

    public static void main(String[] args) {
        System.out.println("Ingrese nombre del empleado");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();
        System.out.println("Ingrese un salario");
        double salario = sc.nextDouble();
        
        if(salario>450000){
            System.out.println("Nombre: "+nombre+" Salario: "+salario);
        }
        else{
            System.out.println("Nombre: "+nombre);
        }
    }
}
