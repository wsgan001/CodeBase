package edu.cumt.EHE;
import java.util.logging.*;
import java.io.*;
/**
 * Created by gaufung on 10/06/2017.
 */

class LoggingException extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}
public class LoggingExceptions {
    public static void main(String[] args){
        try {
            throw new LoggingException();

        }catch (LoggingException e){
            System.err.println("Catch"+e);
        }
        try {
            throw new LoggingException();
        }catch(LoggingException e){
            System.err.println("Catch"+e);
        }
    }
}