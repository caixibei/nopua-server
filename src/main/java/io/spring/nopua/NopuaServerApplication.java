package io.spring.nopua;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"io.spring.nopua"})
@MapperScan(value = {"io.spring.nopua.*.mapper"})
public class NopuaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NopuaServerApplication.class,args);
    }
}
