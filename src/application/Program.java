package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #"+ (i + 1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double soma = 0;
		for(Pessoa p : list) {
			System.out.println(p);
			soma += p.calcularImposto();
		}
		
		System.out.printf("\nTOTAL TAXES: $%.2f%n", soma);
		sc.close();
	}

}
