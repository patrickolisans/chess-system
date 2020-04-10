package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true){
			UI.printBoard(chessMatch.getPieces()); // imprime o tabuleiro na tela
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc); //pede a posi��o de origem
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc); //pede a posi��o de destino
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
