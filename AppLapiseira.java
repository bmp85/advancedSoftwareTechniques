/* 
 * Bianca Pasetto
 * Q4
 */
package questao4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppLapiseira {

	public static void main(String[] args) throws IOException {

		ArrayList<Lapiseira> listaLapiseiras = new ArrayList<Lapiseira>();
		int repetir = 1;
		while (repetir != 0) {

			BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Informe a marca da lapiseira");
			String marca = leitura.readLine();

			System.out.println("Informe a cor da lapiseira");
			String cor = leitura.readLine();

			System.out.println("Informe a espessura do grafite");
			float grafite = Float.parseFloat(leitura.readLine());

			Lapiseira lap = new Lapiseira(marca, cor, grafite);
			listaLapiseiras.add(lap);

			System.out.println("Você quer adicionar mais lapiseiras? Pressione 1--> Sim ou 0 --> Não");
			repetir = Integer.parseInt(leitura.readLine());

		}
		for (Lapiseira i : listaLapiseiras) {

			System.out.println(i.getMarca());
			System.out.println(i.getCor());
			System.out.println(i.getGrafite());
			System.out.println("---------------------");
		}

	}

}
