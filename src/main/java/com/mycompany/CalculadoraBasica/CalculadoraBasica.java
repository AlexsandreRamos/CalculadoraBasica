
package com.mycompany.CalculadoraBasica;

import java.util.Scanner;


public class CalculadoraBasica {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       Scanner teclado2 = new Scanner(System.in);
       
       int num1,num2,resultado; 
       String sinal,enter;
      
        System.out.println(" Bem-vindo a calculadora básica \n //////////////////////////////\n Pressione 'enter' para calcular ");
            enter = teclado2.nextLine();
      
        System.out.println("informe um numero:");
             num1 = teclado.nextInt();
             
       
        
        System.out.println("Escreva o sinal desejado \n\n "
            + " ( + )    ( - )       ( * )         ( / ) \n"
            + " adição   menos   multiplicação   divisão");
                sinal = teclado2.nextLine();
        
        
        if (sinal.equalsIgnoreCase("+") ) {
        System.out.println("informe outro numero:");
            num2 = teclado.nextInt();
            
            resultado = num1 + num2;
            System.out.printf("O resultado é: %d",resultado);
        }
        else{
        
        if (sinal.equalsIgnoreCase("-") ) {
            System.out.println("informe outro numero:");
            num2 = teclado.nextInt();
             
            resultado = num1 - num2;
            System.out.printf("O resultado é: %d",resultado);
        }
        else{
             if (sinal.equalsIgnoreCase("*") ) {
            System.out.println("informe outro numero:");
            num2 = teclado.nextInt();
             
            resultado = num1 * num2;
            System.out.printf("O resultado é: %d",resultado);
        }
        else{
            if (sinal.equalsIgnoreCase("/") ) {
            System.out.println("informe outro numero:");
            num2 = teclado.nextInt();
            
            resultado = num1 / num2;
            System.out.printf("O resultado é: %d",resultado);
        }       
        else{
             System.out.println("esse sinal não existe");
            }            
             }}}
        
        
    }
}
