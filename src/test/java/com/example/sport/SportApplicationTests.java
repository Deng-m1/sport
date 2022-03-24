package com.example.sport;

import com.example.sport.mapper.EasyuserMapper;
import com.example.sport.service.EasyuserService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SportApplicationTests {
    @Autowired
    EasyuserService easyuserService;

    @Test
    void contextLoads() {
        List list = easyuserService.list(null);
        list.forEach(System.out::println);


    }

}
