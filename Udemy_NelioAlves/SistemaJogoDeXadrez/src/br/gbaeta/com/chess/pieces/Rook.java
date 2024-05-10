package br.gbaeta.com.chess.pieces;

import br.gbaeta.com.boardgame.Board;
import br.gbaeta.com.chess.ChessPiece;
import br.gbaeta.com.chess.Color;

/**
 *@author GuilhermeBaeta
 */
public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
