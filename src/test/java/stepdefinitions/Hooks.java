package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Driver;

public class Hooks {

    @Before
    public void before(Scenario scenario){

        //System.out.println("ScenarioId =  " + scenario.getId() );
        System.out.println(scenario.getName() + " has been started");
    }

    @After
    public void after(Scenario scenario){

        System.out.println(scenario.getName() + " : " + scenario.getStatus());

/*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Driver.closeDriver();

 */

    }


}
