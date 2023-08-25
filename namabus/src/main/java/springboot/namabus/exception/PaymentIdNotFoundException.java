package springboot.namabus.exception;




import org.springframework.web.bind.annotation.ResponseStatus;

 

@ResponseStatus

public class PaymentIdNotFoundException extends RuntimeException {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public PaymentIdNotFoundException(String str) {

super(str);

}

}