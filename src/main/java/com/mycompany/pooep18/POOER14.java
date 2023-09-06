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
public class POOER14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ventas del departamento 1");
        double v1 = sc.nextDouble();
        System.out.println("Ingrese ventas del departamento 2");
        double v2 = sc.nextDouble();
        System.out.println("Ingrese ventas del departamento 3");
        double v3 = sc.nextDouble();
        System.out.println("Salario de los vendedores");
        double salario = sc.nextDouble();
        
        double totalV = v1+v2+v3;
        double pv;
        pv = 0.33 * totalV;
        if(v1>pv){
            System.out.println("el salario del departamento 1: "+(salario+0.2*salario));         
        }
        else if(v1<pv){
            System.out.println("el salario del departamento 1: "+salario);
        }
        if(v2>pv){
            System.out.println("el salario del departamento 2: "+(salario+0.2*salario));
        }
        else if(v2<pv){
            System.out.println("el salario del departamento 2: "+salario);
        }
        if(v3>pv){
            System.out.println("el salario del departamento 3: "+(salario+0.2*salario));
        }
        else if(v2<pv){
            System.out.println("el salario del departamento 3: "+salario);
        }       
    }
}
