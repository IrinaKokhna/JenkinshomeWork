package helpers.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;

@Tag("properties")
public class OwnerTests extends TestBase {
    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void readCredTest() {
        String username = credentials.username();
        String password = credentials.password();

        String message = format("I login as %s with password %s", username, password);
        System.out.println(message);
        open("https://revjet.com");
    }
}
