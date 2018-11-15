/**
 * @author DL
 */
public class UserNotFoundException extends Exception
{
    /**
     * Constructs an instance of <code>UserNotFound</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UserNotFoundException(String msg)
    {
        super(msg);
    }
}
