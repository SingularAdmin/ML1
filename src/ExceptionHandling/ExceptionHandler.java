package ExceptionHandling;

import java.sql.SQLException;

public class ExceptionHandler
{
    public ExceptionHandler()
    {
        System.out.println("defult error");
    }
    
    public ExceptionHandler(String msg)
    {
    }
    
    public ExceptionHandler(SQLException msg)
    {
        System.out.println(msg);
    }
}
