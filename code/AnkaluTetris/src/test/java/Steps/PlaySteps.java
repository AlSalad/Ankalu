package Steps;

import GUI.HighscoreView;
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
    HighscoreView highscore;
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

    @Then("^The Highscore gets deleted$")
    public void theHighscoreGetsDeleted() throws Throwable {
       assertEquals(highscore.delete, true);

}

    @Given("^Im on the \"([^\"]*)\"$")
    public void imOnThe(String arg0) throws Throwable {
       highscore = new HighscoreView();
    }

    @And("^I press the \"([^\"]*)\"$")
    public void iPressThe(String arg0) throws Throwable {
        highscore.button_Reset.doClick();
    }

    @And("^I press the Highscorebutton$")
    public void iPressTheHighscorebutton() throws Throwable {
        menu.highscoreButton.doClick();
    }

    @Then("^I can view the Highscore$")
    public void iCanViewTheHighscore() throws Throwable {
        assertEquals("highscore",menu.rett);
    }
}
