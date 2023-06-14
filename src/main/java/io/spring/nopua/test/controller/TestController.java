package io.spring.nopua.test.controller;
import io.spring.nopua.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController("/test")
public class TestController {
    @Autowired
    private TestService testService;
}
