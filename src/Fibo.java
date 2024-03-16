import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int numero = scan.nextInt();
        
        if (Fibonacci(numero)) {
            System.out.println("esse número pertence à sequência de fibonacci: "+numero );
        } else {
            System.out.println("esse número não pertence à sequência de fibonacci: "+numero);
        }
        scan.close();
    
    }
   
    //questao 2 
    /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
     sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
    escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência
    de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
    */
    public static boolean Fibonacci(int numero){
        int x =1;
        int y = 0;

        if (numero<0){
            return false;
        }

        while (x<numero) {
            int variavelTemp=x;
            x=y+x;
            y=variavelTemp;
        }
        return x == numero;

        }
}
