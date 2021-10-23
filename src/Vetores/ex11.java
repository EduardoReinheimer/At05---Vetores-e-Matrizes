package Vetores;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String data = "";
		do {
			System.out.print("Digite a data: ");
			data = input.next();
		} while (!isOnDataFormat(data));
		input.close();

		String[] dataVetor = data.split("/");

		for (String campo : dataVetor) {
			System.out.println(campo);
		}

	}

	private static boolean isOnDataFormat(String dataTexto) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			format.setLenient(false);
			Date data = format.parse(dataTexto);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

}
