package br.gbaeta.com.chess;

import br.gbaeta.com.boardgame.Board;
import br.gbaeta.com.boardgame.Piece;
import br.gbaeta.com.boardgame.Position;

/**
 * @author GuilhermeBaeta
 */
public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position); 
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
