package Steps;

import GUI.MainMenu;
import GUI.PlayMenu;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

import javax.swing.*;



/**
 * Created by z003jy6p on 14.06.2017.
 */
public class PlaySteps {

    MainMenu menu;
    @Given("^I am on the \"([^\"]*)\"$")
    public void iAmOnThe(String arg0) throws Throwable {
       menu = new MainMenu();
    }

    @And("^I press the Button \"([^\"]*)\"$")
    public void iPressTheButton(JButton play) throws Throwable {

        menu.playButton.doClick();
    }

    @Then("^I should be on the \"([^\"]*)\"$")
    public void iShouldBeOnThe(String arg0) throws Throwable {

        assertEquals("play",menu.rett);
    }
}
