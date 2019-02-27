package Opdrachten.opdracht_10.emails;


import Voorbeelden.emails.sender.EMailTemplate;
import Voorbeelden.emails.sender.EmailSender;

public class EmailApplication {

	public static void main(String[] args) {
		EmailSender sender = new EmailSender("e-mailserver", "trainer@ca.com");
		
		EMailTemplate template = new EMailTemplate("Test Email", "Hoi, Groetjes");

		String[] emailAdressen = {"a@a.com","a@e.com","a@d.com","a@c.com","a@b.com",};

		for (String emailAdres : emailAdressen){
			if (sender.validateAddress(emailAdres)){
				sender.sendEmail(template, emailAdres);
			}
		}
		
	}
	
}
