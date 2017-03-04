package PDDL4J.antlr_parser;

/**
 * Exception thrown when language elements (e.g. functions, types, arguments) used in a 
 * PDDL domain or problem do not have a corresponding declaration earlier in the domain file, 
 * or in the domain corresponding to the problem. 
 *
 * @author Jennifer Buehler
 */
public class InvalidPDDLElementException extends Exception
{
    public InvalidPDDLElementException()
    {
        super();
    }

    public InvalidPDDLElementException(String message)
    {
        super(message);
    }

    public InvalidPDDLElementException(Throwable cause)
    {
        super(cause);
    }

    public InvalidPDDLElementException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
