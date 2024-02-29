
package com.mycompany.calculator;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
       
        int num1,num2,resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("informe um numero:");
        num1 = teclado.nextInt();
        
        System.out.println("informe outro numero:");
        num2 = teclado.nextInt();
        
        resultado = num1 * num2;
        System.out.println("resultado:" + resultado);
        
    }
}
