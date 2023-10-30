package zimle.playground;

import java.util.List;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

/** Toy class to experiment with logging.
 *
 * Note that Logback is used as backend with
 *
 */
@Slf4j
class Slf4jTest {

    record HotDog(double temperature, double size) {}

    @Builder(toBuilder = true)
    record HotDogShop(int id, double pricePerItem, List<HotDog> availableHotDogs) {}

    /** Log with MDC and key value pairs. Assumption: Log Level INFO. */
    @Test
    void testFluentVsClassicApi() {
        List<HotDog> hotdogs = List.of(new HotDog(40, 12), new HotDog(15, 13), new HotDog(40, 12));
        HotDogShop hds1 = new HotDogShop(1, 5.9, hotdogs);
        HotDogShop hds2 = hds1.toBuilder().id(2).build();
        // Expected to be logged as log level is assumed to be info
        log.info("Classical style: Hot Dog Shop is {}", hds1);

        // Expected to be logged as key value matches MDCFilter
        try (var ignored = MDC.putCloseable("id", "" + hds1.id())) {
            log.atDebug()
                    .setMessage("New fluent key value style message mit ID")
                    .addKeyValue("HotDogShop1", hds1)
                    .log();
        }

        // expected to be not logged as value is not one and log level not INFO
        try (var ignored = MDC.putCloseable("id", "" + hds2.id())) {
            log.atDebug()
                    .setMessage("New fluent key value style message mit ID")
                    .addKeyValue("HotDogShop2", hds2)
                    .log();
        }
    }
}
