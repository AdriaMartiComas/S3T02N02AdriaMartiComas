package s03t02n02adriamarticomas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BotigaSabates botiga = new BotigaSabates("Food Looker");
		TipusPagament tp = null;

		System.out.println("Seleccionar metode de pagament: ");
		System.out.println("1 - Targeta");
		System.out.println("2 - Paypal");
		System.out.println("3 - Compte bancari");
		int seleccio = sc.nextInt();
		if (seleccio == 1) {
			tp = new Targeta();

		} else if (seleccio == 2) {
			tp = new Paypal();

		} else if (seleccio == 3) {
			tp = new CompteBancari();

		} else {
			System.out.println("metode de pagament mal sel·leccionat");
		}

		System.out.println(botiga.getPassarelaPagament().pagar(tp));
		sc.close();

	}
}
