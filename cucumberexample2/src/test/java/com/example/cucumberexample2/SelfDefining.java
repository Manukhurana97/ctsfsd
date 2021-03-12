package com.example.cucumberexample2;

import com.example.cucumberexample2.model.entity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.parser.Entity;
import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SelfDefining {

    @LocalServerPort
    private int port=8080;
    private RestTemplate restTemplate = new RestTemplate();
    private String postUrl = "http://localhost";
    private Integer postid;

    @Given("i have create new post")
    public void i_have_create_new_post() {
        String url = postUrl + ":" + port + "/findall";
        List<entity> lst = restTemplate.getForObject(url, List.class);
        log.info(lst);
        assertTrue(!lst.isEmpty());

    }
    @Given("^I send a post to be create with id (\\d+),title (.*), and content (.*)$")
    public void i_send_a_post_to_be_create_with_id_title_new_post_and_content_hello(Integer int1, String title, String content) {
        String url = postUrl + ":" + port + "/Add";
        entity entity  = new entity();
        entity.setId(int1);
        entity.setTitle(title);
        entity.setContent(content);
        entity entity1 = restTemplate.postForObject(url, entity, entity.class);
        postid = entity1.getId();
        log.info("added entity"+entity1+" Entity id"+entity1.getId());
        assertNotNull(entity1);

    }
    @Then("I should be able to see my newly created post")
    public void i_should_be_able_to_see_my_newly_created_post() {
        String url = postUrl + ":" + port + "/findall/" + postid;
        entity lst = restTemplate.getForObject(url, entity.class);
        log.info(lst+" "+lst.getId());
        assertNotNull(lst);
    }



}
