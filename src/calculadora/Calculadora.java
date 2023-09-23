
package calculadora;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Calculadora {
 
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);//scan e uma instancia de um obj, da classe Scanner. o valor a direita e o objeto. o lado esquerdo e o tipo da variavel.
       
        System.out.println("Informe a operacao deseja pelos simbolos +, - , * ou /: ");
        char operacao = scan.next().charAt(0); // charAt vai pegar o valor da 1 posicao, next vai pegar o valor retornar como carecter
        
        System.out.println("Digite o primeiro numero:  ");
        int num1 = scan.nextInt() ; //scan.nextInt o metodo e o nextInt, retorna o valor o user digitou.
        System.out.println("Digite o segundo numero:  ");
        int num2 = scan.nextInt() ; 
        
       
        double result = 0; 
        
        if(operacao == '+'){
            
            result = num1 + num2;
            
        } else if(operacao == '-'){
             result = num1 - num2;
            
        } else if(operacao == '*'){
             result = num1* num2;
            
        } else if(operacao == '/'){
            result = num1 / num2;
        } else {
            System.out.println("invalido coloque um simbolo correspondente");
        }
        
        System.out.println( "resultado:  " + num1 + " " + operacao + " " + num2 + " = " + result );
       
        
        
       
        
    }
    
}
