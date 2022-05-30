import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {
    KEYWORD1 ("if"),
    KEYWORD2 ("else"),
    KEYWORD3 ("stop\\b"),
    KEYWORD4 ("let\\b"), //if just 'let' it take the 'let' from letter and makes 2 different tokens 
    KEYWORD5 ("end\\b"),
    COMMA (","),
    LPAR ("\\("),
    RPAR ("\\)"),
    LCURLY ("\\{"),
    RCURLY("\\}"),
    EQUAL ("=="),
    ASSIGN ("="),
    PLUS ("\\+"),
    STAR ("\\*"),
    
    STRING ("\"[^\"]+\""),
    //INT ("\\d\\b"),
    INT ("\\d+(\\.\\d+)?"),
    id ("\\w+");

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }

        return -1;
    }
}
