package menu.controller;

import java.util.ArrayList;

import menu.Menu;
import repository.Repository;

public class Controller implements Repository {
	
	private ArrayList<Menu> listarItens = new ArrayList<Menu>();
	int itens = 0;
	@Override
	public void listarItens(int itens) {
		for (var menu: listarItens) {
			menu.visualizar();
		}
		
		
	}

	@Override
	public void pagar(int total) {
		// TODO Auto-generated method stub
		
	}
	
	
}
