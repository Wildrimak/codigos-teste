package br.com.wildrimak.main;

import java.util.ArrayList;
import java.util.List;

public class PropiedadesTabuleiro {

	private Integer ordem;
	private Position deslocamento;
	private Integer tamanhoDasCasas;
	private List<Casa> casas;

	public PropiedadesTabuleiro(Integer ordem, Position deslocamento, Integer tamanhoDasCasas) {

		this.ordem = ordem;
		this.deslocamento = deslocamento;
		this.tamanhoDasCasas = tamanhoDasCasas;
		this.casas = getCasas();

	}

	public Position getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(Position deslocamento) {
		this.deslocamento = deslocamento;
	}

	public Boolean isClicavel(Position lugarClicado) {

		if (lugarClicado.x < deslocamento.x)
			return false;

		if (lugarClicado.y < deslocamento.y)
			return false;

		if (lugarClicado.x > deslocamento.x + ordem * tamanhoDasCasas)
			return false;

		if (lugarClicado.y > deslocamento.y + ordem * tamanhoDasCasas)
			return false;

		return true;

	}

	public List<Casa> getCasas() {

		casas = new ArrayList<>();
		Integer numeroCasa = 0;

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {

				numeroCasa++;

				Casa casa = new Casa(numeroCasa, i, j, tamanhoDasCasas,
						tamanhoDasCasas % 2 == 0 ? Cor.BRANCO : Cor.PRETO, this);

				casas.add(casa);

			}

		}

		return casas;

	}

}
