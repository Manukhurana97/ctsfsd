package com.example.cucumberexample2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
//        plugin = {"pretty", "json:target/cucumber.xml"},
//        plugin = {"pretty", "json:target/cucumber.html"},
        glue = {"com.example.cucumberexample2"},
        features = {"src/test/resourses/features/Cucumber.feature"},
        tags = "@smoketest"
)
public class cucumberrunnertest {
}
