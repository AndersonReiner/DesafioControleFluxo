import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

		try {

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = lerNumero(scanner);

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = lerNumero(scanner);

            scanner.close();

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

    static int lerNumero(Scanner scanner){
        int numero = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro:");
                scanner.next();
            }
        }
        return numero;
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new  ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		int contagem = parametroDois - parametroUm;
        for(int i = 0; i < contagem; i ++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
	}
}