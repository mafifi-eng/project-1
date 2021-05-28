package encyclopedia;

import java.util.Scanner;

import items.Subject;

public class Runner {

	private static SubjectManager manager = new SubjectManager();
	private static boolean running = true;
	static Scanner scan = new Scanner(System.in);
	static User user = null;

	public static void main(String[] args) {

		// Run the init method to instantiate the app
		manager.init();

		while (running) {

			System.out.println("Welcome to Console Based Encyclopedia! \n\n" + "Want to lookup something?");
			System.out.println("To exit type \"exit\"");
			String input = scan.nextLine();
			Subject[] sub;

			if (input.toLowerCase().equals("yes")) {
				if (user == null) {
					System.out.println("Please enter your name:");
					input = scan.nextLine();
					user = new User(input);
				}

				System.out.println("Hi " + user.getName());

				System.out.println("\nPlease choose from the following menu options: "
						+ "\nFor example, please type \"define Kitchen\"\n");

				sub = manager.getSubjects();

				for (int i = 0; i < sub.length; i++) {
					System.out.println("Define: " + sub[i].getName());
				}

				String pharase[] = collectInput();
				input = parse(pharase, null);

				switch (input) {
				case "kitchen":
					System.out.println(sub[0].getName());
					System.out.println("\n" + sub[0].getShortDesc());
					System.out.println("\nFor more details type \"continue\"");
					input = scan.nextLine();
					System.out.println(sub[0].getLongDesc());
					break;
				case "nano":
					System.out.println(sub[1].getName());
					System.out.println("\n" + sub[1].getShortDesc());
					System.out.println("\nFor more details type \"continue\"");
					input = scan.nextLine();
					System.out.println(sub[1].getLongDesc());
					break;
				case "tcp":
					System.out.println(sub[2].getName());
					System.out.println("\n" + sub[2].getShortDesc());
					System.out.println("\nFor more details type \"continue\"");
					input = scan.nextLine();
					System.out.println(sub[2].getLongDesc());
					break;
				case "living":
					System.out.println(sub[3].getName());
					System.out.println("\n" + sub[3].getShortDesc());
					System.out.println("\nFor more details type \"continue\"");
					input = scan.nextLine();
					System.out.println(sub[3].getLongDesc());
					break;
				case "steve":
					System.out.println(sub[4].getName());
					System.out.println("\n" + sub[4].getShortDesc());
					System.out.println("\nFor more details type \"continue\"");
					input = scan.nextLine();
					System.out.println(sub[4].getLongDesc());
					break;
				case "wikipidia":
					System.out.println(sub[5].getName());
					System.out.println("\n" + sub[5].getShortDesc());
					System.out.println("\nFor more details type \"continue\"");
					input = scan.nextLine();
					System.out.println(sub[5].getLongDesc());
					break;
				}
			} else if (input.toLowerCase().equals("exit")) {
//				break;
				Runtime.getRuntime().exit(0);
			}
		}
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}

	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String[] phrase = input.split(" ");
		return phrase;
	}

	private static String parse(String[] command, User player) {

		return command[1].toLowerCase();
	}

}
