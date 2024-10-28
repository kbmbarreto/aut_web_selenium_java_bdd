package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setup() {}

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }
}
