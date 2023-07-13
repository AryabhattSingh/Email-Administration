package emailAdmin;

public class EmailWithMain {
	
	private static void display(EmailAdmin ea) {
		System.out.println("\n\nEmployee Details are as follows :-");
		System.out.println("\n----------------------------------------------------");
		System.out.println("Name : " + ea.getName());
		System.out.println("\nEmail : " + ea.getEmail());
		System.out.println("\nPassword : " + ea.getPassword());
		System.out.println("\nMailbox Capacity : " + ea.getMailboxCapacity());
		if (ea.altEmail)
			System.out.println("\nAlternate Email : " + ea.getAlternateEmailAddress());
		System.out.println("----------------------------------------------------");
	}

	public static void main(String[] args) {
		EmailAdmin ea = new EmailAdmin();
		ea.takeInput();
		display(ea);
	}

}
