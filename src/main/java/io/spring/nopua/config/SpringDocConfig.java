package io.spring.nopua.config;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class SpringDocConfig {

    private final static String developer = "蔡熙贝";
    private final static String version = "v1.0";

    private final static String title= "NoPua-Admin API";

    private final static String description = "舍我之时，昨日之事不可留；乱我心者，今日之事多烦忧！";

    private final static String license = "Apache 3.0";

    private final static String url = "https://gitee.com/caixibei/";

    @Bean
    public OpenAPI customOpenAPI() {
        log.debug("启用Swagger文档中,请稍后...");
        return new OpenAPI().components(new Components()).
                info(new Info()
                        .title(title)
                        .version(version)
                        .description(description)
                        .contact(new Contact().name(developer).url(url).email("caixibei@139.com"))
                        .license(new License()
                                .name(license)
                                .url(url)))
                .externalDocs(new ExternalDocumentation());
    }
}
