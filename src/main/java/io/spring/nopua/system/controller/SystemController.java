package io.spring.nopua.system.controller;
import io.spring.nopua.system.pojo.User;
import io.spring.nopua.system.service.SystemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Tag(name = "system",description = "系统管理接口")
public class SystemController {
    @Autowired
    private SystemService service;

    @PostMapping("/login")
    @Operation(description = "系统登录")
    public User login(){
        return null;
    }
}
