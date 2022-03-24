import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pb3 {
// nu am stiut cum sa compar cele doua texte...

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Scriet textul  : ");
		String text = input.nextLine();

		System.out.println("Scrie numele fisierului  : ");
		String fisier = input.next();
		System.out.println(" ");

		int nr = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
			/// BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			String line = br.readLine();
			while (line != null) {

				if (line.equals(text)) {

					// System.out.println(line);
					nr++;
				}

				// bw.write(line + "\n");

				line = br.readLine();
			}
			br.close();
			// bw.close();

		} catch (IOException e) {
			System.out.println("Eroare la deschiderea fisierului");
		}

		System.out.println("Nr de linii care sunt egale cu textul sunt : " + nr);

	}

}
