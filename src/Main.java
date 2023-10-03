import parser.*;

import org.antlr.v4.runtime.*;

public class Main {

	public static void main(String... args) throws Exception {

		var file = "C:\\Users\\hoooc\\IdeaProjects\\lab3_lexer\\input.txt";

		// creates a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(file);

		// creates a buffer of tokens pulled from the lexer
		CmmLexer lexer = new CmmLexer(input);

		// shows the info of tokens read
		Token token;
		while ((token = lexer.nextToken()).getType() != CmmLexer.EOF) {
			// We get the semantic value of the token
			Object semanticValue = null;
			switch (token.getType()) {			
			// TODO: Implement the lexemeToChar and lexemeToReal methods in LexerHelper
			case CmmLexer.CHAR_CONSTANT:
				semanticValue = LexerHelper.lexemeToChar(token.getText());
				break;
			case CmmLexer.REAL_CONSTANT:
				semanticValue = LexerHelper.lexemeToReal(token.getText());
				break;

			case CmmLexer.INT_CONSTANT:
				semanticValue = LexerHelper.lexemeToInt(token.getText());
				break;
			default:
				semanticValue = token.getText();
			}
			// We show the token information
			System.out.printf("Line: %d, column: %d, lexeme: '%s', token: %s, semantic value: %s.\n",
							token.getLine(), token.getCharPositionInLine() + 1,
							token.getText(), lexer.getVocabulary()
									.getDisplayName(token.getType()),
							semanticValue);
		}
	}

}
