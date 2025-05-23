package com.ssk.sh;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;

@AutoConfigureWebMvc
@AutoConfigureMockMvc
@SpringBootTest(classes = SskSpringBootTemplateApplication.class)
public class BaseTest {


}