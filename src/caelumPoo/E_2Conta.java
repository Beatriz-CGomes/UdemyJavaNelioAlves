package caelumPoo;

public class E_2Conta {

	int numero;
	double saldo;
	double limite;
	E_2ContaCliente titual = new E_2ContaCliente();

	public E_2Conta() {
	}

	public boolean saca(double quantidade) {
		// double novoSalario = this.saldo - quantidade; this.saldo = novoSalario;
		if (saldo < quantidade) {
			return false;
		} else {
			saldo = saldo - quantidade;
			return true;
		}
	}

	public void deposita(double quantidade) {
		saldo += quantidade;
	}

	public boolean transfere(E_2Conta destino, double valor) {
		// saldo -= valor;
		// destino.saldo = destino.saldo + valor;
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu para sacar
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}

	}

	

}
