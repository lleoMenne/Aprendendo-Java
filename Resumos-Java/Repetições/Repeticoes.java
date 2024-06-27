package Repetições;
import java.util.Scanner;

public class Repeticoes{
    public static void main( String [] args){

        Scanner scanner = new Scanner(System.in);
        
        /*

         Estrutura de Repetição FOR (PARA)  
            
        For ( bloco de inicializção; expressão booleana de validação; bloco de incrementação ){
         Será executado          
        }
            
          */

        for ( int contagem = 0; contagem <= 10; contagem ++ ){
             System.out.println(contagem);
        }

          // FOR em Arrays

        String nomes[] = {"ELOA", "INGRID", "LUCAS", "LEONA"};

        for ( int x = 0; x < nomes.length; x++){
            System.out.println(x + " " + nomes [ x ] );
        }

          // Break e Continue 

        for ( int numero = 1; numero <= 10; numero++ ){
            System.out.println(numero);
            if ( numero == 5 ){
                break; // Ecerra imediatamente
            }

            for ( int numero2 = 1; numero2 <= 10; numero++ ) {
                System.out.println(numero2);
                if ( numero2 == 5 ){
                    continue; // Continua infinamente
                }  
            }
        }
    
         // While (Enquanto)

        int saldo = 0;
        while ( saldo != 10 ){
            System.out.println(saldo);
            saldo = saldo + 1;
            
        }
         // Do While

         do {
            System.out.println("Executou");

         } while (false);  // Executa pelo menos uma vez mesmo sendo false    
    }
}