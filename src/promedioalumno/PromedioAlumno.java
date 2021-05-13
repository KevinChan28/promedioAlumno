/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioalumno;

import java.util.Scanner;

/**
 *Proyecto de demostracion de JavaDoc
 * @author Kevin Adrian Chan Guzman
 * @since Mayo 2020
 * @version 1.0
 */
public class PromedioAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int num1,num2,suma;
        System.out.println("Ingrese el valor del primer numero ");
        num1=teclado.nextInt();
         System.out.println("Ingrese el valor del segundo numero ");
        num2=teclado.nextInt();
        suma=num1+num2;
        System.out.println("El resultado es: "+suma);
    
}
}