package POO;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Dgite a operação (1-adição, 2-subtração, 3-multiplicação,4-divisão, 5-exponenciação, 6-fatorial):");
		int tipo = teclado.nextInt();
		System.out.println("Digite o valor 1: ");
		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 6) {
			System.out.println("Digite o valor 2: ");
			valor2 = teclado.nextInt();
		}
		Operacao operacao2;

		switch (tipo) {
		case 1: operacao2 = new adicao(); break;
		case 2: operacao2 = new subtracao(); break;
		case 3: operacao2 = new multiplicacao(); break;
		case 4: operacao2 = new subtracao(); break;
		case 5: operacao2 = new exponenciacao(); break;
		default:operacao2 = null;
			System.out.println("Não foi possivel identificar a operação desejada");
		}
		System.out.println(operacao2.calcula(valor1, valor2));
	}

}
