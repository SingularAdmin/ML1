package user;

/**
 * @author DL
 */
public class IncorrectUserException extends Exception
{
    /**
     * Constructs an instance of <code>UserNotFound</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectUserException(String msg)
    {
        super(msg);
    }
}
