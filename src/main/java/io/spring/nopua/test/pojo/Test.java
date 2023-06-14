package io.spring.nopua.test.pojo;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.math.BigInteger;
import java.util.Date;
@Component
@Data
public class Test {
    private BigInteger id;
    private Date date;
    private String text;
}
