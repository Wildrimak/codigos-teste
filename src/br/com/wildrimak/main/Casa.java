package br.com.wildrimak.main;

public class Casa {

	private Integer valorNumeral;
	private Integer coordenadaLinha;
	private Integer coordenadaColuna;
	private Integer tamanhoLado;
	private Cor cor;
	private PropiedadesTabuleiro tabuleiro;

	public Casa(Integer valorNumeral, Integer coordenadaLinha, Integer coordenadaColuna, Integer tamanhoLado, Cor cor,
			PropiedadesTabuleiro tabuleiro) {

		this.valorNumeral = valorNumeral;
		this.coordenadaLinha = coordenadaLinha;
		this.coordenadaColuna = coordenadaColuna;
		this.tamanhoLado = tamanhoLado;
		this.cor = cor;
		this.tabuleiro = tabuleiro;

	}

	/**
	 * 
	 * Representa a escolha que o personagem faz, exemplo, 1,2 ou 3
	 *
	 **/
	public Integer getValorNumeral() {
		return valorNumeral;
	}

	public void setValorNumeral(Integer valorNumeral) {
		this.valorNumeral = valorNumeral;
	}

	/**
	 * 
	 * Semelhante ao sistema de batalha naval, só que ao invés de ser letra e
	 * numero, é numero, servindo este apenas para as linhas
	 *
	 **/

	public Integer getCoordenadaLinha() {
		return coordenadaLinha;
	}

	public void setCoordenadaLinha(Integer coordenadaLinha) {
		this.coordenadaLinha = coordenadaLinha;
	}

	/**
	 * 
	 * Semelhante ao sistema de batalha naval, só que ao invés de ser letra e
	 * numero, é numero, servindo este apenas para as colunas
	 *
	 **/

	public Integer getCoordenadaColuna() {
		return coordenadaColuna;
	}

	public void setCoordenadaColuna(Integer coordenadaColuna) {
		this.coordenadaColuna = coordenadaColuna;
	}

	public Integer getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(Integer tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Position getCentro() {

		Position deslocamento = tabuleiro.getDeslocamento();
		int xCentro = tamanhoLado / 2 + tamanhoLado * coordenadaLinha;
		int yCentro = tamanhoLado / 2 + tamanhoLado * coordenadaColuna;

		Position retornada = new Position(xCentro + deslocamento.x, yCentro + deslocamento.y);
		return retornada;
	}

	@Override
	public String toString() {
		return "Casa(" + coordenadaLinha + ", " + coordenadaColuna + ") - Centro: " + getCentro().x + ", "
				+ getCentro().y;
	}

}
