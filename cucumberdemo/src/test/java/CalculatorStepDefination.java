
import com.calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorStepDefination {

    Calculator cal;
    Integer result;
    @Given("I have a calculator")
    public void i_have_a_calculator() {
         cal = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = cal.add(int1, int2);
    }
    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        assertThat(result).isEqualTo(int1);
    }
}
