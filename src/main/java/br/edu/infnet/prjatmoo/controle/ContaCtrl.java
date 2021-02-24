package br.edu.infnet.prjatmoo.controle;

import br.edu.infnet.prjatmoo.modelo.ContaService;

public class ContaCtrl {
	
	private ContaService contaService = new ContaService();
	
	public double getSaldo() {
		String contaNumero = LoginCtrl.conta.getNumero();
		return contaService.getSaldoConta(contaNumero);
	}

	public void depositar(double valor) {
		String contaNumero = LoginCtrl.conta.getNumero();
		contaService.deposita(contaNumero, valor);
	}

	public String saca(double valorSaque) {
		String contaNumero = LoginCtrl.conta.getNumero();
		return contaService.saca(valorSaque, contaNumero);
	}

}
