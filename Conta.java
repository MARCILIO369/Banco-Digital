package conta;

public class Conta {
	
	protected Integer numero;
	protected String nome;	
	protected Double saldo;


	public Conta() { 	}
	
	public Conta(Integer numero, String nome, Double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void depositar(double valor){	
		saldo += valor;
	} 
	
	public void retirar( double valor) {
	 saldo -= valor + 5.0;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	

}
