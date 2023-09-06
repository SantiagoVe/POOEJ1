/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author SantiaG0D
 */
public class POOEP21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte los tres lados del triángulo");
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();
        
        double perimetro = ladoA+ladoB+ladoC;
        double semiP = perimetro/2;
        double area = Math.sqrt(semiP * (semiP *ladoA) * (semiP*ladoB) * (semiP*ladoC));
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Semiperímetro del triángulo: " + semiP);
        System.out.println("Área del triángulo: " + area);
    }
}