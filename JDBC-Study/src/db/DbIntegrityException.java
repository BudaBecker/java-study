package db;

public class DbIntegrityException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
