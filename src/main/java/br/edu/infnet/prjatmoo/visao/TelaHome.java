package br.edu.infnet.prjatmoo.visao;

import java.util.Scanner;

import br.edu.infnet.prjatmoo.controle.HomeCtrl;

public class TelaHome {

	private int opcao;
	private HomeCtrl homeCtrl= new HomeCtrl();

	public void apresentar() {

		Scanner scanner = new Scanner(System.in);
		
		while (opcao <= 3) {
			System.out.println(" Menu ");
			System.out.println(" 1- ver o saldo ");
			System.out.println(" 2- Saque ");
			System.out.println(" 3 -Deposito ");
			System.out.println(" 4 - Sair ");
			System.out.println(" Entre com a opcao: ");

			opcao = scanner.nextInt();
			homeCtrl.abrir(opcao);
		}

	}

}
