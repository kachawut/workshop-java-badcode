package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterBusinessTest {

    //fail
    @Test
    @DisplayName("Fail First name is required.")
    public void case101() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        ArgumentNullException thrown = assertThrows(
                ArgumentNullException.class,
                () -> registerBusiness.register(null, new Speaker())
        );
        assertEquals(thrown.getMessage(), "First name is required.");
    }

    @Test
    @DisplayName("Fail Last name is required.")
    public void case102() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Mk");
        ArgumentNullException thrown = assertThrows(
                ArgumentNullException.class,
                () -> registerBusiness.register(null, speaker)
        );
        assertEquals(thrown.getMessage(), "Last name is required.");
    }

    @Test
    @DisplayName("Fail Email is required.")
    public void case103() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("M");
        speaker.setLastName("k");
        ArgumentNullException thrown = assertThrows(
                ArgumentNullException.class,
                () -> registerBusiness.register(null, speaker)
        );
        assertEquals(thrown.getMessage(), "Email is required.");
    }

}