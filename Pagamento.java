package Pagamento;

public abstract class Pagamento {
	
	String nomedoCliente;
	private int CPF;
	private int RG;
	
	
	public Pagamento(String nomedoCliente, int cPF, int rG) {
		super();
		this.nomedoCliente = nomedoCliente;
		CPF = cPF;
		RG = rG;
	}

	public String getNomedoCliente() {
		return nomedoCliente;
	}

	public void setNomedoCliente(String nomedoCliente) {
		this.nomedoCliente = nomedoCliente;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}
	
	public void visualizar() {
		
		String formadePagamento = "";
		
		System.out.println("\n\n-------------------------------------------------");
		System.out.println("Dados do: ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Nome do Cliente: " + this.nomedoCliente );
		System.out.println("CPF do Cliente: " + this.CPF);
		System.out.println("RG do Cliente: " + this.RG);
		System.out.println("\nForma de Pagamento: " + formadePagamento);
		
	}
	
	
	

}
