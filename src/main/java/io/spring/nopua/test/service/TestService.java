package io.spring.nopua.test.service;

import io.spring.nopua.test.pojo.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    List<Test> selectAll();
}
