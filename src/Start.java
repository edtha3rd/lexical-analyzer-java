public class Start {
    public static void main(String s[]) {
        Lexer lexer = new Lexer("C:/Users/TA1DA/Documents/Java/lexAnalyzer/lexAnalyzer/src/SampleCode.txt");

        while (!lexer.isExhausted()) {
                System.out.println("(#" + lexer.currentToken() + ", " + lexer.currentlexeme() + ")");
                lexer.moveAhead();
            
        }

        if (lexer.isSuccessful()) {
            System.out.println("\nDONE!");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
