package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import pages.GooglePage;

public class GoogleSteps {

    @Inject
    GooglePage gpage;

    @Given("I load a google page and quit")
    public void navigateToDPResponsivePage() throws InterruptedException {
        gpage.navigate();
    }
}
