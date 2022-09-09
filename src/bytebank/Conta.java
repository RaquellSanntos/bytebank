package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	String cpf;
	String profissao;
	
	void deposita(double valor) {
		this.saldo+= valor;

	}
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("valor sacado");
			return true;
		}else {
			System.out.println("valor insuficiente");
			return false;
			
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
