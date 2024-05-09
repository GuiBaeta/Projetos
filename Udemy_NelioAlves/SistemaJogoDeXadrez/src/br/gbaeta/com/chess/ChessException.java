package br.gbaeta.com.chess;

import br.gbaeta.com.boardgame.BoardException;

/**
 *@author GuilhermeBaeta
 */
public class ChessException extends BoardException{
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
