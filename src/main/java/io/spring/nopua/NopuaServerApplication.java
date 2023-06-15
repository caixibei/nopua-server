package io.spring.nopua;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
@SpringBootApplication(scanBasePackages = {"io.spring.nopua"})
@MapperScan(value = {"io.spring.nopua.*.mapper"})
public class NopuaServerApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NopuaServerApplication.class, args);
		Environment environment = context.getEnvironment();
		String port = environment.getProperty("server.port");
	}
}
