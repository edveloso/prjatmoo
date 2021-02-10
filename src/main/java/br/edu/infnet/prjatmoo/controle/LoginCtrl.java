package br.edu.infnet.prjatmoo.controle;

import br.edu.infnet.prjatmoo.modelo.Conta;
import br.edu.infnet.prjatmoo.visao.TelaHome;

public class LoginCtrl {
	
	public static Conta conta;
	
	
	public void login(String conta, int pin) {
		if(conta.equals("123") && pin ==456) {
			this.conta = new Conta(conta, pin);
			TelaHome home = new TelaHome();
			home.apresentar();
		}
	}

}
