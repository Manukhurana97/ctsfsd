package com.example.cucumberexample2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json"},
        glue = {"com.example.cucumberexample2"},
        features = {"src/test/resourses/features/Cucumber.feature"})
public class cucumberrunnertest {
}
