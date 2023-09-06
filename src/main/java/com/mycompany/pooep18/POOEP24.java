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
public class POOEP24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso de una esfera A");
        double esfA,esfB,esfC;
        esfA = sc.nextDouble();
        System.out.println("Ingrese el peso de una esfera B");
        esfB = sc.nextDouble();
        System.out.println("Ingrese el peso de una esfera C");
        esfC = sc.nextDouble();
        if(esfA>esfB && esfA>esfC){
            System.out.println("La esfera A es la de mayor peso");
        }
        if(esfB>esfA && esfB>esfC){
            System.out.println("La esfera B es la de mayor peso");
        }
        if(esfC>esfA && esfC>esfB){
            System.out.println("La esfera C es la de mayor peso");
        }
    }
}
