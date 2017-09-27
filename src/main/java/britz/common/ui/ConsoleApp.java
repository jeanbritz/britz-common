package britz.common.ui;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class ConsoleApp implements Runnable  {
	
	private Console console = System.console();
	
	private List<Page> pages = new ArrayList<Page>();
	private Stack<Page> history = new Stack<>();
	
	private Page currentPage = null;
	private boolean running = false;
	
	public void run() {
				
	}
	
	public void addPage(Page page) {
		pages.add(page);
	}
	
	public void navigateHome() {
		while(history.size() > 1) {
			history.pop();
		}
	}
	
	public Page navigateBack() {
		return history.pop();
	}
}
