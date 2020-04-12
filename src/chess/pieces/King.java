package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		ChessPiece p =(ChessPiece)getBoard().piece(position);
		return p == null || p.getColor()!= getColor(); // se p for igual a nulo OU se cor da peça de p for diferente da cor do rei
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		
		//acima
		p.setValues( position.getRow()-1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;
		}
		
		//esquerda
		p.setValues( position.getRow(), position.getColumn()-1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;
		}
		
		//direita
		p.setValues( position.getRow(), position.getColumn()+1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;
		}
		
		//abaixo
		p.setValues( position.getRow()+1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;
		}
		
		//diagonal sup direita
		p.setValues( position.getRow()-1, position.getColumn()+1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;
		}
		
		//diagonal sup esquerda
		p.setValues( position.getRow()-1, position.getColumn()-1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;	
		}
		
		//diagonal inf direita
		p.setValues( position.getRow()+1, position.getColumn()+1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;	
		}
		
		//diagonal sup esquerda
		p.setValues( position.getRow()+1, position.getColumn()-1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat [p.getRow()][p.getColumn()]= true;	
		}
		
		return mat;
	}

}
