package fr.plaisance.exception;

import fr.plaisance.PerudoUtil;

@SuppressWarnings("serial")
public class NotEnoughPlayersException extends PerudoException {
	
	private static final String message = PerudoUtil.message("exception.not.enough.player");
	
	public NotEnoughPlayersException(){
		super(message);
	}
}
