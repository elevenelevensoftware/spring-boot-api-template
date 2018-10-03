package com.example.apitestv4;

import com.example.apitestv4.controller.MainViewController;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTestV4ApplicationTests {

    @Autowired
    private MainViewController mainViewController;

    @Test
    public void contextLoads() {
        assertThat(mainViewController).isNotNull();
    }

    @Test
    public void applicationStarts() {
        ApiTestV4Application.main(new String[] {});
    }
}
