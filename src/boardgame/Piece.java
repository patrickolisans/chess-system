package boardgame;

public class Piece {
	protected Position position; //n pode ser visivel na camada de xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
}
