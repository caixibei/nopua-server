package io.spring.nopua.test.mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TestMapper {

    List selectAll();
}
