package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

    public static Object lexemeToReal(String text) {
		try {
			return Integer.parseInt(text);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
    }

	public static Object lexemeToChar(String text) {
		if (text == null || text.length() < 2) {
			throw new IllegalArgumentException("Invalid character constant: " + text);
		}

		// Strip the enclosing single quotes
		String inner = text.substring(1, text.length() - 1);

		// If there's only one character and it's not a backslash, return it
		if (inner.length() == 1 && inner.charAt(0) != '\\') {
			return inner.charAt(0);
		}

		// Handle the escape sequences
		switch (inner) {
			case "\\n": return '\n';
			case "\\t": return '\t';
			case "\\r": return '\r';
			case "\\'": return '\'';
			case "\\\\": return '\\';
			default:
				throw new IllegalArgumentException("Unknown escape sequence: " + inner);
		}
	}


	// TODO: Implement the lexemeToChar and lexemeToReal methods
	
}
