/**
 * Created by Dima on 02.06.2016.
 */
public class StackException extends Exception {
    public StackException() {
    }
    public StackException(String message) {
        super(message);
    }
    public StackException(String message, Throwable cause) {
        super(message, cause);
    }
    public StackException(Throwable cause) {
        super(cause);
    }
}

