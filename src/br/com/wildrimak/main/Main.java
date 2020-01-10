package br.com.wildrimak.main;

public class Main {

	public static void main(String[] args) {

		PropiedadesTabuleiro tabuleiro = new PropiedadesTabuleiro(8, new Position(0,0), 128);

		tabuleiro.getCasas().forEach(casa -> {
			System.out.println(casa);
		});
		
	}
}
