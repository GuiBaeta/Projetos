package br.gbaeta.com.chess.pieces;

import br.gbaeta.com.boardgame.Board;
import br.gbaeta.com.chess.ChessPiece;
import br.gbaeta.com.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
