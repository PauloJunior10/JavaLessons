package Basic;

import java.util.Scanner;

public class SistemaEscola {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double somadorNotas = 0;
		int somadorNumeroNotas = 0;
		double nota = 1;
		
		while(nota != 0) {
			System.out.println("Insira uma nota: ");
			nota = scanner.nextDouble();
			if(nota !=0) {
				somadorNotas += nota;
				somadorNumeroNotas += 1;
			}
		}
		
		double media = somadorNotas / somadorNumeroNotas;
		
		System.out.println("Media: " + media);
	}

}
