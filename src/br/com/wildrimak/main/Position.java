package br.com.wildrimak.main;

public class Position {

	public Integer x;
	public Integer y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return this.x + " " + this.y;
	}

}
