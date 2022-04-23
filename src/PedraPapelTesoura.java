import java.util.Random;
import java.util.Scanner;

/**
 * @author Lucas Hoepers
 *
 */
public class PedraPapelTesoura {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner ler = new Scanner(System.in);

		int pc = random.nextInt(3);
		String name;

		System.out.printf("Escolha pedra, papel ou tesoura: ");
		name = ler.next();

		logica(pc, name);
		ler.close();
	}

	private static void logica(int pc, String name) {
		int valor = 99;

		if (name.equals("pedra")) {
			valor = 0;
		} else if (name.equals("papel")) {
			valor = 1;
		} else if (name.equals("tesoura")) {
			valor = 2;
		}

		if (valor == pc) {
			System.out.printf("Empate");
		} else if ((valor == 0 && pc == 1) || 
				   (valor == 1 && pc == 2) || 
				   (valor == 2 && pc == 0)) {
			System.out.printf("PC ganhou");
		} else if ((valor == 1 && pc == 0) || 
				   (valor == 2 && pc == 1) || 
				   (valor == 0 && pc == 2)) {
			System.out.printf("O pai ganhou");
		} else {
			System.out.printf("Digite algo válido");
		}
	}
}