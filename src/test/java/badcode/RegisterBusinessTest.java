package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterBusinessTest {

    @Test
    @DisplayName("Fail First name is required.")
    public void case101() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        try {
            registerBusiness.register(null,new Speaker());
            fail();
        } catch (ArgumentNullException e){
            if(!e.getMessage().equals("First name is required.")){
                fail();
            }

        }
    }

}