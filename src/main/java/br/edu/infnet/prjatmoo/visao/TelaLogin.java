package br.edu.infnet.prjatmoo.visao;

import java.util.Scanner;

import br.edu.infnet.prjatmoo.controle.LoginCtrl;

public class TelaLogin {
	
	private String conta;
	private int pin;
	private LoginCtrl loginCtrl = new LoginCtrl();
	
	
	public void apresentar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo");
		System.out.print("Informa o numero da conta");
		conta = scan.next();
		System.out.print("Informa o pin: ");
		pin = scan.nextInt();
		loginCtrl.login(conta, pin);
	}
	

}
