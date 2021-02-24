package br.edu.infnet.prjatmoo.modelo;

public class Conta {
	
	private String numero;
	
	private int pin;
	
	private double saldo;
	
	public Conta(String numero, int pin) {
		this.numero = numero;
		this.pin = pin;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	
	

}
