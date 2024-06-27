import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {		
		entradaDeDados();
		}
	static void entradaDeDados() {
	Scanner scanner = new Scanner(System.in);
	
		int ValorTotal = 0;
		int contador = 0;
		
		System.out.println("Adicione o primeiro número:");
		int numero01 = scanner.nextInt();
		
		System.out.println("Adicione o segundo número:");
		int numero02 = scanner.nextInt();
		
		try {
			
			if (numero01 < numero02) {
				throw new Exception("ParametrosInvalidosException");
			}
			else{ ValorTotal = numero01 - numero02; }
			System.out.println(ValorTotal);
			
		}catch(Exception e){ 
			System.out.println("Segundo número tem que ser maior que o primeiro número.");
			System.out.println("Tente novamente -> ");
			entradaDeDados();
		}	
		
		while(contador != ValorTotal) {
			contador++;
			System.out.println( "Imprimindo o número " + contador);		
		}
	}
}