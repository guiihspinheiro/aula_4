package model;

public class ContaPoupanca extends Conta{
	private double rendimento;
	public ContaPoupanca(String Email, double rendimento) {
		super(Email);
		this.rendimento = rendimento;
	}

	public String Saque(double valorSaque) {
		if(valorSaque <= Saldo) {
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
		Saldo += valorDeposito + (valorDeposito*rendimento);
		return ("Valor Sacado: " + valorDeposito
		+ "\nValor Saldo Após o Saque: "
		+ Saldo);
		
		}
	
	public double getSaldo() {
		return Saldo;
				}
	}
