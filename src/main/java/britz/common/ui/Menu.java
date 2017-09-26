package britz.common.ui;

public interface Menu {
	
	void onSelection(int selection);
	
	String getBody();
	
	String getHeader();
}
