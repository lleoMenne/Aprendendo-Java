import java.util.Scanner;

public class Condicionais {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        //"Estrtura Condicional IF,ELSE IF, ELSE

        System.out.println("Escolha um numero maior que 5 e menor que 10");
        
        int numero = scanner.nextInt();

        if ( numero > 5 && numero < 10 ){
            System.out.println("Maior que 5");
        }

        else if ( numero <= 5){
            System.out.println("Menor ou igual a 5");
        }

        else if ( numero > 10) {
            System.out.println("Maior que 10");
        }    
        
        else{
            System.out.println("Numero indefinido");
        }

         //"Estrutura Codicional SWITCH CASE")

        System.out.println("Escolha um tamanho entre P, M, G, GG");
        String letra = scanner.next();
    
        switch ( letra ){
            case "P": {
                System.out.println("Tamanho Pequeno");
            }
            
            case "M": {
                System.out.println("Tamanho Medio");
            }

            case "G": {
                System.out.println("Tamanho Grande");
            }

            case "GG": {
                System.out.println("Tamanho Extra Grande");
            }

            default :{
                System.out.println("Tamanho indefinido");

            }
        }
    }
}