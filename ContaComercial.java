package conta;

public class ContaComercial extends Conta {
	
	
	private Double limite;
	
	ContaComercial(){
		super();
	}

	public ContaComercial(Integer numero, String nome, Double saldo, Double limite) {
		super(numero, nome, saldo);
		this.limite = limite;
	}

	public Double getLimite() { return limite;	}

	public void setLimite(Double limite) { 	this.limite = limite; 	}
	
	
	public void emprestimo( Double valor) {
		if (valor <= limite) {
			depositar(valor);
			saldo += valor - 10.00;
		}
		
	}
	
	
	
	
	

	
}
