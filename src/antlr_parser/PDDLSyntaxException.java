package PDDL4J.antlr_parser;

/**
 * Exception thrown when the syntax of the supplied PDDL file does not conform
 * to the PDDL grammar.
 *
 * @author Jennifer Buehler
 */
public class PDDLSyntaxException extends Exception
{
    public PDDLSyntaxException()
    {
        super();
    }

    public PDDLSyntaxException(String message)
    {
        super(message);
    }

    public PDDLSyntaxException(Throwable cause)
    {
        super(cause);
    }

    public PDDLSyntaxException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
