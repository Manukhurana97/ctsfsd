package com.example.cucumberexample2;

import com.example.cucumberexample2.model.entity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SelfDefining {

    @LocalServerPort
    private int port = 8080;
    private RestTemplate restTemplate = new RestTemplate();
    private String postUrl = "http://localhost";
    private Integer postid;



    @Given("the user details:")
    public void the_user_details(List<Map<String, String>> lst) {
        String url = postUrl + ":" + port + "/Add";
        lst.stream().forEach(
                list_data -> {
                    entity ent = new entity();
                    ent.setId(Integer.parseInt(list_data.get("id")));
                    ent.setUsername(list_data.get("username"));
                    ent.setPassword(list_data.get("password"));
                    entity entity1 = restTemplate.postForObject(url, ent, entity.class);
                    assertNotNull(entity1);

                }
        );

    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("login page");
    }

    @When("^user enter (.*) and (.*)")
    public void user_enter_username_and_password(String username,  String password) {
        System.out.println(username+" "+password);
        String url = postUrl + ":" + port + "/login";
        entity ent = new entity();
        ent.setUsername(username);
        ent.setPassword(password);
        ent = restTemplate.postForObject(url, ent,entity.class);
        postid = ent.getId();
        log.info(ent);
        assertNotNull(ent);


    }

    @Then("check  username and password is correct is correct")
    public void check_username_and_password_is_correct_is_correct() {
        String url = postUrl + ":" + port + "/findall/"+postid;
        entity entity = restTemplate.getForObject(url, entity.class);
        log.info(entity.getUsername());
        assertNotNull(entity);

    }


}
