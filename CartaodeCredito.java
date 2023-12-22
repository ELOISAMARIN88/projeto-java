package Pagamento;

public class CartaodeCredito extends Pagamento {
	
	private int numerodoCartaoCredito;
	private int dataexpiracaoCartaoCredito;
	private int cvvdoCartaoCredito;

	public CartaodeCredito(String nomedoCliente, int cPF, int rG) {
		super(nomedoCliente, cPF, rG);
		
		
	}

	public CartaodeCredito(String nomedoCliente, int cPF, int rG, int numerodoCartaoCredito,
			int dataexpiracaoCartaoCredito, int cvvdoCartaoCredito) {
		super(nomedoCliente, cPF, rG);
		this.numerodoCartaoCredito = numerodoCartaoCredito;
		this.dataexpiracaoCartaoCredito = dataexpiracaoCartaoCredito;
		this.cvvdoCartaoCredito = cvvdoCartaoCredito;
		
		
	}

	public int getNumerodoCartaoCredito() {
		return numerodoCartaoCredito;
	}

	public void setNumerodoCartaoCredito(int numerodoCartaoCredito) {
		this.numerodoCartaoCredito = numerodoCartaoCredito;
	}

	public int getDataexpiracaoCartaoCredito() {
		return dataexpiracaoCartaoCredito;
	}

	public void setDataexpiracaoCartaoCredito(int dataexpiracaoCartaoCredito) {
		this.dataexpiracaoCartaoCredito = dataexpiracaoCartaoCredito;
	}

	public int getCvvdoCartaoCredito() {
		return cvvdoCartaoCredito;
	}

	public void setCvvdoCartaoCredito(int cvvdoCartaoCredito) {
		this.cvvdoCartaoCredito = cvvdoCartaoCredito;
	}
	
	

}
