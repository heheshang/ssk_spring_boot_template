package com.ssk.sh.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import com.ssk.sh.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@Slf4j
class DemoControllerTest extends BaseTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getDemoInfo() throws Exception {

        MvcResult mvcResult = mockMvc.perform(post("/demo")
                .contentType("application/json")
                .content("{\"name\":\"ssk\",\"price\":100,\"remark\":\"remark\",\"status\":\"success\"}")
                .accept("application/json")
                .characterEncoding("UTF-8")

        ).andReturn();
        log.info("{}", mvcResult.getResponse().getContentAsString());
    }
}