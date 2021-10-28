package by.epam.task02.exception;

/**
 * ServiceException class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class ServiceException extends Exception {

    /**
     * ServiceException constructor with parameter
     *
     * @param message - message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * ServiceException constructor with parameter
     *
     * @param e - exception
     */
    public ServiceException(Exception e) {
        super(e);
    }

}
