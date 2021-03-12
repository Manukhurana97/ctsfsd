package com.loyaltymember;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
// glue : test define package
// features: define feature file package
@CucumberOptions(plugin = {"pretty"}, glue = {"com.loyaltymember"}, features = {"classpath:features/loyalitycard"})
public class SmootieTestRunner {
}
