package internship.week13.DebuggerDemo;

/**
 *
 */
public class StringUtilities {
	private StringBuilder sBuilder = new StringBuilder();
	private int charAdded = 0;

	public void addChar(StringBuilder sBuilder, char c) {
		this.sBuilder.append(c);
		charAdded++;
	}
}
