// glue code

package com.loyaltymember;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.AbstractIntegerAssert;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperSmoothieStepDefinations {
    
    public DrinkCatalog drinkCatalog = new DrinkCatalog();
    public SuperShoothieSchema superShoothieSchema = new SuperShoothieSchema(drinkCatalog);
    public MorningFreshnessMember michel;



    @Given("the Following drink categories:")
    public void the_following_drink_categories(List<Map<String, String>> drinkCategories) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        
        drinkCategories.stream().forEach(
                drinkCategory -> {
                    String drink = drinkCategory.get("Drink");
                    String category = drinkCategory.get("Category");
                    Integer points = Integer.parseInt(drinkCategory.get("Points"));
                    drinkCatalog.addDrink(drink, category);
                    superShoothieSchema.addCategory(category, points);
                }
        );
    }
    @Given("^(.*) is a Morning Freshness Member")
    public void michael_is_a_morning_freshness_member(String name) {
        // Write code here that turns the phrase above into concrete actions
        michel = new MorningFreshnessMember(name, superShoothieSchema);

    }
    @When("^(.*) purchases (\\d+) (.*) drinks?")
    public void michael_purchases_1lemon_tea_drinks(String name, Integer int1, String drink) {
        // Write code here that turns the phrase above into concrete actions
        michel.orders(int1, drink);
    }
    @Then("he should earn {int} points")
    public AbstractIntegerAssert<?> he_should_earn_points(Integer expectedPoints) {
        System.out.println(michel.getPoints());
        System.out.println(expectedPoints);
        return assertThat(michel.getPoints()).isEqualTo(expectedPoints);

    }

}
