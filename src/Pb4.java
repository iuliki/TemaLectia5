import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pb4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("M= ");
		int N = input.nextInt();
		System.out.print("N= ");
		int M = input.nextInt();
		System.out.print("P= ");
		int P = input.nextInt();

		double[][] matrice1 = new double[N][M];
		double[][] matrice2 = new double[M][P];
		double[][] matrice3 = new double[M][P];

		System.out.println("Prima matrice este ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print("[" + i + "," + j + "] = ");
				matrice1[i][j] = input.nextInt();
			}
		}

		System.out.println("A doua  matrice este ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print("[" + i + "," + j + "] = ");
				matrice2[i][j] = input.nextInt();
			}

		}

		System.out.println("Afisare cele doua matrici");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(matrice1[i][j] + " ");

			}
			System.out.println("\n");
		}

		System.out.println("\n");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(matrice2[i][j] + " ");

			}
			System.out.println("\n");
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					matrice3[i][j] = matrice3[i][j] + matrice1[i][j] * matrice2[i][j];

				}
			}
		}

		System.out.println("Matricea dupa inmultire este : \n");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(matrice3[i][j] + " ");

			}
			System.out.println("\n");
		}

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < P; j++) {
					bw.write(matrice3[i][j] + " ");

				}
				System.out.println("\n");
			}

			bw.close();

		} catch (IOException e) {
			System.out.println("Eroare la deschiderea fisierului");
		}
	}

}
