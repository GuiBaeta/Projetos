package br.gbaeta.com.application;

import br.gbaeta.com.chess.ChessMatch;

/**
 * @author GuilhermeBaeta
 */
public class Program {

	public static void main(String[] args) {
		 
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}