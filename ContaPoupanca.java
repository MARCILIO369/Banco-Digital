package conta;

public class ContaPoupanca extends Conta{
	
	private Double taxajuros;
	
	public ContaPoupanca() {
	 super();
	 
	}

	public ContaPoupanca(Integer numero, String nome, Double saldo, Double taxajuros) {
		super(numero, nome, saldo);
		this.taxajuros = taxajuros;
	}

	public Double getTaxajuros() {
		return taxajuros;
	}

	public void setTaxajuros(Double taxajuros) {
		this.taxajuros = taxajuros;
	}
	
	public void atualizarsaldo() {
		saldo += saldo * taxajuros;
		 
	}
	
	@Override
	public void retirar( double valor) {
		 saldo -= valor ;
		}
	
	
	

}
