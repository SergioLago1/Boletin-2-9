/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg9;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float billetes100, billetes20, billetes5;
    System.out.println("Introduce numero de billetes de 100 :");
    Scanner billetes100teclado= new Scanner(System.in);
    billetes100= billetes100teclado.nextFloat();
    System.out.println("Introduce numero de billetes de 20 :");
    Scanner billetes20teclado= new Scanner(System.in);
    billetes20= billetes20teclado.nextFloat();
    System.out.println("Introduce numero de billetes de 5 :");
    Scanner billetes5teclado= new Scanner(System.in);
    billetes5= billetes5teclado.nextFloat();
    System.out.println("El numero de euros es :"+(billetes100*100)+(billetes20*20)+(billetes5*5));
    }
    
}
