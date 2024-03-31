package indi.zeroornull.pattern.builder.stepbuilder.httprequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    public static void main(String[] args) {
        HttpRequest request =
            HttpRequest.builder().withUrl("https://api.example.com").withMethod(HttpRequest.HttpMethod.POST)
                .withHeader("Content-Type", "application/json").withHeader("A","B").withParameter("key1", "value1")
                .withParameter("key2", "value2").withBody("key1", "value1").withBody("key2", "value2").build();

        log.info("Url: " + request.getUrl());
        log.info("Method: " + request.getMethod());
        log.info("Headers: " + request.getHeaders());
        log.info("Parameters: " + request.getParameters());
        log.info("Body: " + request.getBody());
    }
}