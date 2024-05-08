package br.gbaeta.com.chess;

import br.gbaeta.com.boardgame.Board;
import br.gbaeta.com.boardgame.Piece;

/**
 * @author GuilhermeBaeta
 */
public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
