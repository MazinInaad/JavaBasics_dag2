package Voorbeelden.emails.sender;

/**
 * Deze class beschrijft 1 e-mail object. Deze voert geen validate uit over de
 * verschillende velden. 
 *
 */
public class Email {

	private String fromAddress;
	private String toAddress;
	private String subject;
	private String body;
	
	public Email(String fromAddress, String toAddress, String subject, String body) {
		super();
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.subject = subject;
		this.body = body;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}
	
	
}
