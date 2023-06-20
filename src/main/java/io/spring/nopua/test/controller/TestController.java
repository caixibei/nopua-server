package io.spring.nopua.test.controller;
import io.spring.nopua.test.pojo.Test;
import io.spring.nopua.test.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@Tag(name="接口测试",description = "测试接口文档")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/selectAll")
    @Operation(description = "查询所有测试数据")
    public List<Test> selectAll(){
        return testService.selectAll();
    }

}
