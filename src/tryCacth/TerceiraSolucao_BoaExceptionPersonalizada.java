package tryCacth;

public class TerceiraSolucao_BoaExceptionPersonalizada extends RuntimeException {

	/**
	 * 
	 */
	// declaração de uma versão serivalVersion
	private static final long serialVersionUID = 1L;

	
	public TerceiraSolucao_BoaExceptionPersonalizada(String msg) {
		super(msg);
	}

	// RuntimeException é um tipo de exceção que o compilado não me obriga a tratar

	// Exception é um tipo de exceção que o compilador me obriga a tratar

}
