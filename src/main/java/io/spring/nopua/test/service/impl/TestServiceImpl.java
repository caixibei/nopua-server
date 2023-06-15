package io.spring.nopua.test.service.impl;
import io.spring.nopua.test.mapper.TestMapper;
import io.spring.nopua.test.pojo.Test;
import io.spring.nopua.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> selectAll() {
        return testMapper.selectAll();
    }
}
