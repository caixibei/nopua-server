package io.spring.nopua.test.controller;
import io.spring.nopua.test.pojo.Test;
import io.spring.nopua.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController("test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/selectAll")
    public @ResponseBody List<Test> selectAll(){
        return testService.selectAll();
    }
}
