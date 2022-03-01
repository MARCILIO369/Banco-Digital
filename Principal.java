package conta;

public class Principal {

	public static void main(String[] args) {
		
		Conta cc = new Conta(1001, "Marcilio", 100.00);
		ContaComercial ccm = new ContaComercial(1002, "Jennife", 0.0, 500.00);
		
		
		// UPCASTING - o objeto da subclasse foi atribuido a super classe, uma relação 1 um
		
		//Conta acc1 = ccm;
		//Conta acc2 = new ContaComercial(103, "Marcilio",0.0, 200.0);
		//Conta acc3 = new ContaPoupanca(103, "Jeanine",0.0,0.01);
		
		
		 Conta c = new Conta(101, "Alex", 1000.00);
		 c.retirar(200.00);
		 System.out.println(c.getSaldo());
		 
		 Conta cp = new ContaPoupanca(101,"cilo", 1000.0, 0.01);
		 cp.retirar(200.00);
		 System.out.println(cp.getSaldo());
		

		
	}

}
