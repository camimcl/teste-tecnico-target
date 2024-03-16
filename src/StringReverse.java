import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Por favor, Digite uma palavra/frase");
        String palavra = scan.next();

        String palavraInvertida = inverterString(palavra);

        System.out.println("A inversão do que foi digitado é: " + palavraInvertida);
    }

    public static String inverterString(String palavra) {
        int inicio = 0;
        char[] letras = palavra.toCharArray();
        int fim = letras.length - 1;

        while (inicio < fim) {
           
            char temp = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = temp;
          
            inicio++;
            fim--;
        }
        return new String(letras);

        // forma mais simples(não sei se podia usar xD):

        // StringBuilder stringInvertida = new StringBuilder();
        // for (int i = palavra.length() - 1; i >= 0; i--) {
        //    stringInvertida.append(palavra.charAt(i));
        // }
        // return stringInvertida.toString();

    }
    
}




