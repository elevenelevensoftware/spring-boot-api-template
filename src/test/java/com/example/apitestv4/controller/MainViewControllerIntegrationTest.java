package com.example.apitestv4.controller;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainViewControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void should_receive_2xx_type_status_for_url() {

        ResponseEntity<String> responseEntity =
                this.testRestTemplate
                        .exchange("/mainview/", HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), String.class);

        assertThat(responseEntity.getStatusCode().value()).isEqualTo(200);
    }

    @Test
    public void should_get_result_single_search_term_response_from_api() {

        ResponseEntity<String> responseEntity =
                this.testRestTemplate
                        .exchange("/mainview/search-for/manchester", HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), String.class);

        assertThat(responseEntity.getBody()).isEqualTo("[{\"content\":\"result is here\"}]");
    }
}
