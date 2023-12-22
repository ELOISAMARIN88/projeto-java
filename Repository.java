package repository;

import menu.Menu;
import Pagamento.Pagamento;

public interface Repository {
	
	//CRUD da Menu
	
	public void listarItens(int itens);
	
	
	//CRUD da Pagamento
	
	public void pagar ( int total);
	
	

}
