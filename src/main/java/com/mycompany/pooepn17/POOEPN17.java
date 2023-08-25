
package com.mycompany.pooepn17;

import java.util.Scanner;

public class POOEPN17 {

    public static void main(String[] args) {
        System.out.println("Dame el radio de un círculo");
        Scanner sc = new Scanner(System.in);
        double ac, lc, r = sc.nextDouble();
        
        ac = Math.PI * Math.pow(r, 2);
        lc = 2*Math.PI*r;
        System.out.println("El area del circulo con radio " + r +" es = "+ ac);
        System.out.println("La longitud de la circunferencia del círculo con radio " + r +" es = "+ lc);
    }
}
