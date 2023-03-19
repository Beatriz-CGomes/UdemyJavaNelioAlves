package model.exceptions;

public class BankDomainException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BankDomainException(String msg) {
		super(msg);
	}

}
