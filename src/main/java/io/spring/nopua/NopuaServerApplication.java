package io.spring.nopua;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"io.spring.nopua"})
@MapperScan(value = {"io.spring.nopua.*.mapper"})
@Slf4j
public class NopuaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NopuaServerApplication.class, args);
    }
}
