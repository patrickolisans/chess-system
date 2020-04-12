package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position (0,0);
		
		//verificando acima da pe�a
		p.setValues(position.getRow()-1,position.getColumn());
		while (getBoard().positionExists(p)&&!getBoard().thereIsAPiece(p)) { //enquanto a posi��o existir e estiver vaga marca ela como verdadeira
			mat[p.getRow()][p.getColumn()]=true; //marca como verdadeiro a posi��o na matriz indicando que a pe�a pode mover para esse lugar
			p.setRow(p.getRow()-1); //fazer a linha subir
		}
		if (getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()]=true;
		}
		
		// verificando a esquerda da pe�a
		p.setValues(position.getRow(),position.getColumn()-1);
		while (getBoard().positionExists(p)&&!getBoard().thereIsAPiece(p)) { 
			mat[p.getRow()][p.getColumn()]=true; 
			p.setColumn(p.getColumn()-1); 
		}
		if (getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()]=true;
		}
		
		//verificando a direita da pe�a
		p.setValues(position.getRow(),position.getColumn()+1);
		while (getBoard().positionExists(p)&&!getBoard().thereIsAPiece(p)) { 
			mat[p.getRow()][p.getColumn()]=true; 
			p.setColumn(p.getColumn()+1); 
		}
		if (getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()]=true;
		}
		
		//verificando acima da pe�a
		p.setValues(position.getRow()+1,position.getColumn());
		while (getBoard().positionExists(p)&&!getBoard().thereIsAPiece(p)) { 
			mat[p.getRow()][p.getColumn()]=true; 
			p.setRow(p.getRow()+1); 
		}
		if (getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()]=true;
		}
		return mat;
	}
}
