package by.epam.task02.exception;

/**
 * ResourceException class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class ResourceException extends Exception {

    /**
     * ResourceException constructor with parameter
     *
     * @param e - exception
     */
    public ResourceException(Exception e) {
        super(e);
    }

}
