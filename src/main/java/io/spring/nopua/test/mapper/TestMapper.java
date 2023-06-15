package io.spring.nopua.test.mapper;
import io.spring.nopua.test.pojo.Test;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TestMapper {

    List<Test> selectAll();
}
