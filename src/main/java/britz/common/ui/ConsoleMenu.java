package britz.common.ui;

import java.io.PrintStream;

public class ConsoleMenu {
	
	
	Menu selection;
	PrintStream out;
	
	public ConsoleMenu(PrintStream out) {
		this.out = out;
	}
	
	public void setMenuSelector(Menu selection) {
		this.selection = selection;
	}
	
	public void onSelection(int choice) {
		this.selection.onSelection(choice);
	}
	
	public void display() {
		out.println(selection.getHeader());
		out.println(selection.getBody());
		out.println("-----------------------");
	}
}
