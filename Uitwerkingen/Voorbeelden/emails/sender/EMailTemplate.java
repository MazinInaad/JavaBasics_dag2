package Voorbeelden.emails.sender;

/**
 * E-mail template met onderwerp en body
 * 
 */
public class EMailTemplate {

	private String subject;
	private String body;

	/**
	 * Maak een nieuw e-mail template met gegeven onderwerp en tekst 
	 * 
	 * @param subject
	 * @param body
	 */
	public EMailTemplate(String subject, String body) {
		super();
		this.subject = subject;
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}

}
