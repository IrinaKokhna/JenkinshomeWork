package helpers.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void testFirst() {
        String value = System.getProperty("value");
        System.out.println(value);
        // null
    }

    @Test
    @Tag("properties")
    void browserTest() {
        String value = System.getProperty("browser", "chrome");
        System.out.println(value);

    }
    @Test
    @Tag("properties")
    void browserTest2() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }
}
