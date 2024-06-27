import java.util.Scanner;
import java.util.Locale;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("""
──────▄▀▄─────▄▀▄         BEM-VINDO AO BANCO CAT, PARA CONTINUAR COM
─────▄█░░▀▀▀▀▀░░█▄        SEU ATENDIMENTO PEÇO POR FAVOR QUE CONFIRME
─▄▄──█░░░░░░░░░░░█──▄▄    AS INFORMAÇÕES DA SUA CONTA EM NOSSO SISTEMA.
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█
                """);

    System.out.println("Qual é o seu nome completo? Ex: Marcos.Rodrigo");
    
    String nome = scanner.next(); // ENTRADA DA VARIAVEL NOME
    System.out.println("Nome:" + nome ); //STATUS 01

    System.out.println("Qual é o seu numero? Ex: 55(85)98781-9961");

    String numero = scanner.next(); // ENTRADA DA VARIAVEL NUMERO
    System.out.println("Nome:" + nome + "| Numero:" + numero); // STATUS 02

    System.out.println("Qual é a sua agencia? Ex: 016");

    int agencia = scanner.nextInt(); // ENTRADA DA VARIAVEL AGENCIA
    System.out.println("Nome:" + nome + "| Numero:" + numero + "| Agencia:" + agencia); // STATUS 03

    System.out.println("Seu saldo atual? Ex: 5000");

    int saldo = scanner.nextInt(); // ENTRADA DA VARIAVEL saldo
    System.out.println("Nome:" + nome + "| Numero:" + numero + "| Agencia:" + agencia + "| Saldo:" + saldo); // STATUS 04

    System.out.println("""
───▄▄▄
─▄▀░▄░▀▄
─█░█▄▀░█
─█░▀▄▄▀█▄█▄▀
▄▄█▄▄▄▄███▀   NOSSO SISTEMA ESTÁ LENTO, VOLTE DEPOIS.
            """);
            
    }
}
