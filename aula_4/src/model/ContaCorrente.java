package model;

public class ContaCorrente extends Conta {
	
	private double valorTaxa;
	

	ContaCorrente(String Email, double ValorTaxa) {
		super(Email);
		this.valorTaxa = ValorTaxa;
		// TODO Auto-generated constructor stub
	}
	
	public String Saque(double valorSaque) {
		if(valorSaque <= Saldo) {
		Saldo =- valorTaxa;
		Saldo =- valorSaque;
		return (
				"Valor Sacado: " + valorSaque
				+"\nValor Saldo Após o Saque: " + Saldo
				);
		
		} else {
			return "Saldo Insuficiente";
		}
	}
	public String Deposito(double valorDeposito) {
		Saldo += valorDeposito;
		return ("Valor Sacado: " + valorDeposito
		+ "\nValor Saldo Após o Saque: "
		+ Saldo);
		
		}
	
	public double getSaldo() {
		return Saldo;
				}
}
