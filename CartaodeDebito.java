package Pagamento;

public class CartaodeDebito extends Pagamento {
	
	private int numerodoCartaoDebito;
	private int dataexpiracaoCartaoDebito;
	private int cvvdoCartaoDebito;
	
	
	public CartaodeDebito(String nomedoCliente, int cPF, int rG) {
		super(nomedoCliente, cPF, rG);
		
	}


	public CartaodeDebito(String nomedoCliente, int cPF, int rG, int numerodoCartaoDebito,
			int dataexpiracaoCartaoDebito, int cvvdoCartaoDebito) {
		super(nomedoCliente, cPF, rG);
		this.numerodoCartaoDebito = numerodoCartaoDebito;
		this.dataexpiracaoCartaoDebito = dataexpiracaoCartaoDebito;
		this.cvvdoCartaoDebito = cvvdoCartaoDebito;
	}


	public int getNumerodoCartaoDebito() {
		return numerodoCartaoDebito;
	}


	public void setNumerodoCartaoDebito(int numerodoCartaoDebito) {
		this.numerodoCartaoDebito = numerodoCartaoDebito;
	}


	public int getDataexpiracaoCartaoDebito() {
		return dataexpiracaoCartaoDebito;
	}


	public void setDataexpiracaoCartaoDebito(int dataexpiracaoCartaoDebito) {
		this.dataexpiracaoCartaoDebito = dataexpiracaoCartaoDebito;
	}


	public int getCvvdoCartaoDebito() {
		return cvvdoCartaoDebito;
	}


	public void setCvvdoCartaoDebito(int cvvdoCartaoDebito) {
		this.cvvdoCartaoDebito = cvvdoCartaoDebito;
	}
	
	public void visualizar() {
		System.out.println("\n\n-------------------------------------------------");
		System.out.println("Dados do Cartão de Débito : ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Número do Cartão de Débito: " + this.numerodoCartaoCredito );
		System.out.println("Data Expiração do Certão de Débito: " + this.dataexpiracaoCartaoCredito);
		System.out.println("CVV do Cartão de Débito: " + this.cvvdoCartaoCredito);
		
	}
	

}
