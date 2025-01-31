import java.util.logging.Logger;

public class SLoging {
    private static Logger log = Logger.getLogger(String.valueOf(SLoging.class));

    private SLoging(){}

    public static Logger getLog() {
        return log;
    }
}
