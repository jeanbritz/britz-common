package britz.common;

import java.util.Scanner;

import britz.common.ui.ConsoleMenu;
import britz.common.ui.Menu;

public class App {
	
	private Menu mainMenu = new MainMenu();
	private Menu clientMenu = new ClientMenu();
	
	private Scanner userInput = new Scanner(System.in);
	
	public App() {
	
	}
	
	public static void main(String[] args) {
		ConsoleMenu menu = new ConsoleMenu(System.out);
		new App();
	}
	
	class MainMenu implements Menu {

		public void onSelection(int selection) {
					
		}

		public String getBody() {
			String body = "Choose option\n";
			body += "1) Start client\n";
			body += "2) Start server\n";
			body += "3) Quit";
			return body;
		}

		public String getHeader() {
			
			return "--- ACME APP ----";
		}
		
	}
	
	class ClientMenu implements Menu {

		public void onSelection(int selection) {
						
		}

		public String getBody() {
			String body = "";
			body += "Choose Option:\n";
			body += "1) Send Login Request\n";
			body += "2) Send Logout Request\n";
			body += "3) Close socket\n";
			return body;
		}

		public String getHeader() {
			
			return "--- CLIENT MENU ---";
		}
		
	}
	
}
