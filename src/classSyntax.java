
public class classSyntax
{

    static public void main(String args[]) // <- Note the syntax in this line, that works fine
    {                                      //    But void ever comes before main keyword.
        // Do foo stuff ...
        StringBuilder $strbuilder = new StringBuilder("stuff");//  These variable works fine, because I can
        StringBuffer $strbuffer = new StringBuffer("stuff");  //  Start var name with _ and $ ( Java is Awesome. )
        
        // <THE END>
    }

}
