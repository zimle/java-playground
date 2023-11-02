package zimle.playground;

import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.spi.LoggingEventBuilder;

/** Support methods for logging to make it shorter and less painful.
 *
 * <p>Currently, only an API a la {@link Map#of()} is supported to make the logging wiht key/value pairs less verbose.
 * Only providing objects and using the local variable names via reflection does not work, as they are compiler
 * internals and event might not get into compiled code.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Slf4jSupport {

    /** Return {@link LoggingEventBuilder} at debug level with key/value already set. */
    public static LoggingEventBuilder debugKv(Logger logger, String k, Object v) {
        LoggingEventBuilder atDebug = logger.atDebug();
        return atDebug.addKeyValue(k, () -> v);
    }

    /** Return {@link LoggingEventBuilder} at debug level with keys/values already set. */
    public static LoggingEventBuilder debugKv(Logger logger, String k1, Object v1, String k2, Object v2) {
        LoggingEventBuilder atDebug = logger.atDebug();
        atDebug.addKeyValue(k1, v1);
        atDebug.addKeyValue(k2, v2);
        return atDebug;
    }

    /** Return {@link LoggingEventBuilder} at debug level with keys/values already set. */
    public static LoggingEventBuilder debugKv(
            Logger logger, String k1, Object v1, String k2, Object v2, String k3, Object v3) {
        LoggingEventBuilder atDebug = logger.atDebug();
        atDebug.addKeyValue(k1, v1);
        atDebug.addKeyValue(k2, v2);
        atDebug.addKeyValue(k3, v3);
        return atDebug;
    }

    /** Return {@link LoggingEventBuilder} at debug level with keys/values already set. */
    public static LoggingEventBuilder debugKv(
            Logger logger, String k1, Object v1, String k2, Object v2, String k3, Object v3, String k4, Object v4) {
        LoggingEventBuilder atDebug = logger.atDebug();
        atDebug.addKeyValue(k1, v1);
        atDebug.addKeyValue(k2, v2);
        atDebug.addKeyValue(k3, v3);
        atDebug.addKeyValue(k4, v4);
        return atDebug;
    }

    /** Return {@link LoggingEventBuilder} at debug level with keys/values already set. */
    public static LoggingEventBuilder debugKv(
            Logger logger,
            String k1,
            Object v1,
            String k2,
            Object v2,
            String k3,
            Object v3,
            String k4,
            Object v4,
            String k5,
            Object v5) {
        LoggingEventBuilder atDebug = logger.atDebug();
        atDebug.addKeyValue(k1, v1);
        atDebug.addKeyValue(k2, v2);
        atDebug.addKeyValue(k3, v3);
        atDebug.addKeyValue(k4, v4);
        atDebug.addKeyValue(k5, v5);
        return atDebug;
    }
}
