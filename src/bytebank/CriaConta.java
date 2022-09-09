package bytebank;

public class CriaConta {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println("Atualmente a primeira conta tem: " + primeiraConta.saldo);

		// Criar uma segunda conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);

		System.out.println("Primeira conta tem: " + primeiraConta.agencia);
		System.out.println("Primeira conta tem: " + primeiraConta.numero);
		System.out.println("Primeira conta tem: " + primeiraConta.titular);

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
