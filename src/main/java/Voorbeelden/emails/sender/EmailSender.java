package emails.sender;

/**
 * Deze class verstuurt e-mails via de opgegeven server met het opgegeven van-adres.
 * 
 * @author BABEEK
 *
 */
public class EmailSender {

	private String serverName;
	private String fromAddress;
	
	/**
	 * Maak een nieuwe sender object aan
	 * 
	 * @param serverName de server die deze sender moet gebruiken
	 * @param fromAddress het van-adres in de e-mails, die via dit object worden verstuurd
	 */
	public EmailSender(String serverName, String fromAddress) {
		this.serverName = serverName;
		setFromAddress(fromAddress);
	}

	/**
	 * De naam van de gebruikte server.
	 * 
	 * @return IP adres of DNS naam
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * E-mail adres in het van-veld van de e-mail specificatie
	 * 
	 * @return e-mail adres
	 */
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * Verander het van-adres zonder een nieuwe sender object te hoeven maken.
	 * Dit adres moet een valide e-mail adres zijn. 
	 * 
	 * @param fromAddress Valide e-mail adres
	 */
	public void setFromAddress(String fromAddress) {
		if (!validateAddress(fromAddress)) {
			throw new IllegalArgumentException("Ongeldig e-mail adres");
		}
		this.fromAddress = fromAddress;
	}

	/**
	 * Verstuurt een e-mail naar toAddress. De e-mail tekst wordt opgebouwd uit de template.
	 * 
	 * @param template Template met subject en body van de e-mail
	 * @param toAddress Adres waarnaar de e-mail verstuurd moet worden
	 */
	public void sendEmail(EMailTemplate template, String toAddress) {
		System.out.println("E-mail object maken van template");
		Email email = new Email(fromAddress, toAddress, template.getSubject(), template.getBody());
		System.out.println("Verbinding maken met "+serverName);
		System.out.println("E-mail versturen van " + email.getFromAddress() + " aan " + email.getToAddress()
				+ " met onderwerp '" + email.getSubject()+"'");
		
		System.out.println("Verbinding sluiten");
	}

	/**
	 * Valideer of een string een geldig e-mail adres bevat. Deze functie controleert niet of het
	 * adres wel of niet bestaat.
	 * 
	 * @param address een tekst bestaande uit een mogelijk geldig e-mail adres
	 * @return true als de string een geldig e-mail adres is
	 */
	public boolean validateAddress(String address) {
		if (address == null || address.isEmpty()) { // Controleer of address echt bestaat en gevuld is
			return false;
		}
		
		int atSymbolIndex = address.indexOf('@');
		int dotSymbolIndex = address.lastIndexOf('.');
		if (atSymbolIndex < 1) { // Minimaal 1 karakter en dan pas @
			return false;
		}
		if (dotSymbolIndex < 3) { // minimaal 2 karaketers en @ en dan pas .
			return false;
		}
		if (address.length() == dotSymbolIndex) { // er moet minstens 1 karakter na de punt komen
			return false;
		}
		return true;
	}
	
}
