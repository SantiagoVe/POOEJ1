/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooepn17;

import java.util.Scanner;

/**
 *
 * @author SantiaG0D
 */
public class POOEPN14 {
    public static void main(String[] args) {
        System.out.println("Dame un número n");
        Scanner sc = new Scanner(System.in);
        double cua,cub,n = sc.nextDouble();
        cua = Math.pow(n, 2);
        cub = Math.pow(n, 3);
        System.out.println("El cuadrado de " + n + " es = " + cua);
        System.out.println("El cubo de " + n + " es = " + cub);
    }
 }
